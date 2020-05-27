package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import fr.epsi.mspr.recycl.repository.V_DEMANDERepository;
import fr.epsi.mspr.recycl.repository.V_EMPLOYERepository;
import fr.epsi.mspr.recycl.repository.service.V_DEMANDEService;
import fr.epsi.mspr.recycl.repository.service.V_EMPLOYEService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
public class V_DEMANDEImpl implements V_DEMANDEService {

    private V_DEMANDERepository v_demandeRepository;

    @Autowired
    public V_DEMANDEImpl(V_DEMANDERepository v_demandeRepository){
        this.v_demandeRepository = v_demandeRepository;
    }

    public List<V_DEMANDE> findTournee(Date date) throws Exception {
        Iterable<V_DEMANDE> list = v_demandeRepository.findTournee(date);
        List<V_DEMANDE> myList = Lists.newArrayList(list);
        if(!myList.isEmpty()){
            return myList;
        }
        else{
            throw new Exception("aucune demande");
        }
    }

}
