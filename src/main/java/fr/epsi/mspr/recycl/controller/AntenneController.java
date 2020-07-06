package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_ANTENNE;
import fr.epsi.mspr.recycl.repository.V_ANTENNE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class AntenneController {

    @Autowired
    private V_ANTENNE_Repository v_antenne_repository;

    @GetMapping("/antenne")
    public @ResponseBody
    String getAllAntenne() throws Exception {
        Iterable<V_ANTENNE> myIterator = v_antenne_repository.findAll();
        List<V_ANTENNE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
