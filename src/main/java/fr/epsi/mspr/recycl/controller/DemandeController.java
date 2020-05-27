package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import fr.epsi.mspr.recycl.repository.V_DEMANDERepository;
import fr.epsi.mspr.recycl.repository.service.EmployeService;
import fr.epsi.mspr.recycl.repository.service.V_DEMANDEService;
import fr.epsi.mspr.recycl.repository.service.V_EMPLOYEService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import java.util.List;

@RestController
public class DemandeController {


    @Autowired
    private V_DEMANDERepository demandeRepo;

    @GetMapping("/demande")
    public @ResponseBody String getUser(@RequestParam String date) throws Exception {
        Date d = new SimpleDateFormat("yyyy-MM-dd").parse(date);
        Iterable<V_DEMANDE> myIterator = demandeRepo.findTournee(d);
        List<V_DEMANDE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
