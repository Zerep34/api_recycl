package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.ENTREPRISE;
import fr.epsi.mspr.recycl.repository.V_ENTREPRISE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class EntrepriseController {


    @Autowired
    private V_ENTREPRISE_Repository v_entrepriseRepository;

    @PostMapping("/entreprise")
    public @ResponseBody String getEntreprise(@RequestParam String name) throws Exception {
        Iterable<ENTREPRISE> myIterator = v_entrepriseRepository.plus_demande(name);
        List<ENTREPRISE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
