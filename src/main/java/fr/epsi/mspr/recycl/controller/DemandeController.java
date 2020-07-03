package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_DEMANDE_NON_INSCRITE;
import fr.epsi.mspr.recycl.repository.V_DEMANDE_NON_INSCRITE_Repository;
import fr.epsi.mspr.recycl.repository.V_DEMANDE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class DemandeController {


    @Autowired
    private V_DEMANDE_Repository demandeRepo;

    @Autowired
    private V_DEMANDE_NON_INSCRITE_Repository demande_non_inscrite_repository;

    @PostMapping("/demande_detail")
    public @ResponseBody String getDemande(@RequestParam String num) throws Exception {
        Iterable<V_DEMANDE> myIterator = demandeRepo.findDetail(Integer.parseInt(num));
        List<V_DEMANDE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

    @PostMapping("/demande_non_inscrite")
    public @ResponseBody String demandeNonInscrite(){
        Iterable<V_DEMANDE_NON_INSCRITE> myIterator = demande_non_inscrite_repository.findAll();
        List<V_DEMANDE_NON_INSCRITE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
