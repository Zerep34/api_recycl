package fr.epsi.mspr.recycl.controller;

import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import fr.epsi.mspr.recycl.model.PoubelleReleve;
import fr.epsi.mspr.recycl.repository.PoubelleRepository;
import fr.epsi.mspr.recycl.repository.service.PoubelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

@Controller
public class IotController {


    int compteur = 0;

    @Autowired
    private PoubelleRepository poubelleRepository;

    @Autowired
    private PoubelleService poubelleService;

    @PostMapping("/greeting")
    public @ResponseBody  String greeting(@RequestBody String body) throws Exception {
        System.out.println(body);
        JsonObject jsonObject = new JsonParser().parse(body).getAsJsonObject();
        poubelleService.save(new PoubelleReleve(compteur, this.getNameFromJson(jsonObject),
                                    this.getTimeStampFromJson(jsonObject), this.getValueFromJson(jsonObject)));
        compteur++;
        write_to_a_file(body);
        return body;
    }

    public void write_to_a_file(String text){
        try {
            File myObj = new File("log.txt");
            if (myObj.createNewFile()) {
                System.out.println("File created: " + myObj.getName());
            } else {
                System.out.println("File already exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
        try {
            FileWriter myWriter = new FileWriter("log.txt");
            myWriter.write(text+";");
            myWriter.close();
            System.out.println("Successfully wrote to the file.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }

    public int getValueFromJson(JsonObject jsonObject){
        return jsonObject.get("device").getAsJsonObject()
                    .get("telemetry").getAsJsonObject()
                        .get("Connected_Waste_Bin_7dd").getAsJsonObject()
                            .get("FillLevel").getAsJsonObject()
                                .get("value").getAsInt();
    }

    public Date getTimeStampFromJson(JsonObject jsonObject) throws ParseException {
        String temp_time = jsonObject.get("timestamp").getAsString();
        temp_time = temp_time.replace("T", " ");
        temp_time = temp_time.replace("Z", "");
        temp_time = temp_time.substring(0, temp_time.length()-4);
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        return formatter.parse(temp_time);

    }

    public String getNameFromJson(JsonObject jsonObject) {
        return jsonObject.get("device").getAsJsonObject()
                .get("displayName").getAsString();
    }
}
