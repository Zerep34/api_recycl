package fr.epsi.mspr.recycl.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;

@Controller
public class IotController {

    ArrayList<String> test = new ArrayList<>();

    @PostMapping("/greeting")
    public @ResponseBody  String greeting(@RequestBody String body) {
        System.out.println(body);
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

}
