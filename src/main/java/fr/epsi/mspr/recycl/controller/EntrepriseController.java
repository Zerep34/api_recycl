package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.ENTREPRISE;
import fr.epsi.mspr.recycl.model.ENTREPRISE_Short;
import fr.epsi.mspr.recycl.repository.ENTREPRISE_Short_Repository;
import fr.epsi.mspr.recycl.repository.V_ENTREPRISE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class EntrepriseController {


    @Autowired
    private V_ENTREPRISE_Repository v_entrepriseRepository;

    @Autowired
    private ENTREPRISE_Short_Repository entreprise_short_repository;

    @PostMapping("/entreprise")
    public @ResponseBody String getEntreprise(@RequestParam int name) throws Exception {
        Iterable<ENTREPRISE> myIterator = v_entrepriseRepository.plus_demande(name);
        List<ENTREPRISE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

    @GetMapping("/all_entreprise")
    public @ResponseBody String getAllEntreprise(){
        Iterable<ENTREPRISE_Short> liste_entreprise = entreprise_short_repository.getAllEntreprise();
        List<ENTREPRISE_Short> myList = Lists.newArrayList(liste_entreprise);
        return new Gson().toJson(myList);
    }

}
