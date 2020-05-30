package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.repository.V_DEMANDE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class Demande_Controller {


    @Autowired
    private V_DEMANDE_Repository demandeRepo;

    @PostMapping("/demande")
    public @ResponseBody String getDemande(@RequestParam String date) throws Exception {
        Date d = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        Iterable<V_DEMANDE> myIterator = demandeRepo.findTournee(d);
        List<V_DEMANDE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
