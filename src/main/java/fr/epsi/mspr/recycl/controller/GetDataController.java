package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_GET_DATA;
import fr.epsi.mspr.recycl.model.view.V_VILLE;
import fr.epsi.mspr.recycl.repository.V_GET_DATA_Repository;
import fr.epsi.mspr.recycl.repository.V_VILLE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class GetDataController {

    @Autowired
    private V_GET_DATA_Repository vGetDataRepository;

    @GetMapping("/getDataBin")
    public @ResponseBody String getDataFromBin(@RequestParam String name) throws Exception {
        Iterable<V_GET_DATA> myIterator = vGetDataRepository.getDataFromBin(name);
        List<V_GET_DATA> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
