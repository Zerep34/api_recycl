package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_DEMANDE_NON_TRAITEE;
import fr.epsi.mspr.recycl.repository.V_DEMANDE_NON_TRAITEE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class DemandeNonTraiteController {


    @Autowired
    private V_DEMANDE_NON_TRAITEE_Repository demande_non_traiteeRepository;

    @GetMapping("/demande_non_traite")
    public @ResponseBody String getDemandeNonTraite() throws Exception {
        Iterable<V_DEMANDE_NON_TRAITEE> myIterator = demande_non_traiteeRepository.findAll();
        List<V_DEMANDE_NON_TRAITEE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

    @GetMapping("/add_demande_non_traite")
    public @ResponseBody String getAddDemandeNonTraite(@RequestParam int id){
        String result = demande_non_traiteeRepository.inscriptionDemande(id);
        return result;
    }

}
