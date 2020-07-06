package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_EMPLOYE_COUNT;
import fr.epsi.mspr.recycl.repository.V_EMPLOYE_COUNT_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserCountController {

    @Autowired
    V_EMPLOYE_COUNT_Repository employe_count_repository;

    @PostMapping("/less_tournee")
    public @ResponseBody
    String less_tournee(@RequestParam int nb) {
        Iterable<V_EMPLOYE_COUNT> myIterator = employe_count_repository.emp_tournee(nb);
        List<V_EMPLOYE_COUNT> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }
}
