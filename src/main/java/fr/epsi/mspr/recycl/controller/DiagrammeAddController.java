package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_DIAGRAMME_ADD;
import fr.epsi.mspr.recycl.repository.V_DIAGRAMME_ADD_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DiagrammeAddController {

    @Autowired
    private V_DIAGRAMME_ADD_Repository diagramme_add_repository;

    @GetMapping("/diagramme_add")
    public @ResponseBody
    String getDechet_month() throws Exception {
        Iterable<V_DIAGRAMME_ADD> myIterator = diagramme_add_repository.findAll();
        List<V_DIAGRAMME_ADD> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }
}
