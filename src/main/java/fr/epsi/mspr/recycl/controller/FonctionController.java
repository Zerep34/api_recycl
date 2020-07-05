package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_FONCTION;
import fr.epsi.mspr.recycl.model.view.V_VILLE;
import fr.epsi.mspr.recycl.repository.V_FONCTION_Repository;
import fr.epsi.mspr.recycl.repository.V_VILLE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FonctionController {

    @Autowired
    private V_FONCTION_Repository v_fonction_repository;

    @GetMapping("/fonction")
    public @ResponseBody String getAllAntenne() throws Exception {
        Iterable<V_FONCTION> myIterator = v_fonction_repository.findAll();
        List<V_FONCTION> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
