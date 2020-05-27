package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_DECHET_MOIS;
import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.repository.V_DECHET_MOISRepository;
import fr.epsi.mspr.recycl.repository.V_DEMANDERepository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class Dechet_Mois_Controller {

    @Autowired
    private V_DECHET_MOISRepository dechetMoisRepository;

    @GetMapping("/dechet_mois")
    public @ResponseBody String getDechet_month() throws Exception {
        Iterable<V_DECHET_MOIS> myIterator = dechetMoisRepository.findAll();
        List<V_DECHET_MOIS> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
