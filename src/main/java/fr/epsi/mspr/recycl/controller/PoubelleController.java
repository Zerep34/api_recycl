package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_POUBELLE;
import fr.epsi.mspr.recycl.repository.V_POUBELLE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class PoubelleController {

    @Autowired
    private V_POUBELLE_Repository v_poubelle_repository;

    @GetMapping("/poubelles")
    public @ResponseBody
    String getAllAntenne() throws Exception {
        Iterable<V_POUBELLE> myIterator = v_poubelle_repository.findAll();
        List<V_POUBELLE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
