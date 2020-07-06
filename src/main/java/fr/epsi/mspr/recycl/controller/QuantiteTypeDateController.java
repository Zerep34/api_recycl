package fr.epsi.mspr.recycl.controller;

import com.google.gson.Gson;
import fr.epsi.mspr.recycl.model.view.V_PROCEDURE_QUANTITE_DECHET_DATE;
import fr.epsi.mspr.recycl.repository.V_PROCEDURE_QUANTITE_DECHET_DATE_Repository;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;

@RestController
public class QuantiteTypeDateController {

    @Autowired
    private V_PROCEDURE_QUANTITE_DECHET_DATE_Repository procedure_quantite_dechet_date_repository;

    @PostMapping("/quantite_dechet_periode")
    public @ResponseBody
    String get_Type_Antenne_Periode(@RequestParam String debut, @RequestParam String fin, @RequestParam String antenne) throws Exception {
        Date debut_date = new SimpleDateFormat("yyyy-MM-dd").parse(debut);
        Date fin_date = new SimpleDateFormat("yyyy-MM-dd").parse(fin);
        Iterable<V_PROCEDURE_QUANTITE_DECHET_DATE> myIterator = procedure_quantite_dechet_date_repository.quantite_dechet_date(debut_date, fin_date, antenne);
        List<V_PROCEDURE_QUANTITE_DECHET_DATE> myList = Lists.newArrayList(myIterator);
        return new Gson().toJson(myList);
    }

}
