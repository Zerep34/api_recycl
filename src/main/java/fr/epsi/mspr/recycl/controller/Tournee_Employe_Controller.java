package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_TOURNEE_EMPLOYE;
import fr.epsi.mspr.recycl.repository.V_TOURNEE_EMPLOYE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Tournee_Employe_Controller {


    @Autowired
    private V_TOURNEE_EMPLOYE_Repository v_tournee_employeRepository;

    @GetMapping("/tournee_employe")
    public @ResponseBody String getTourneeEmploye(@RequestParam String login) throws Exception {
        Iterable<V_TOURNEE_EMPLOYE> myIterator = v_tournee_employeRepository.findTourneeByEmploye(login);
        List<V_TOURNEE_EMPLOYE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
