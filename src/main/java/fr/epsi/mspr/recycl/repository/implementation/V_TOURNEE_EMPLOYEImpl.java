package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_TOURNEE_EMPLOYE;
import fr.epsi.mspr.recycl.repository.V_DEMANDERepository;
import fr.epsi.mspr.recycl.repository.V_EMPLOYERepository;
import fr.epsi.mspr.recycl.repository.V_TOURNEE_EMPLOYERepository;
import fr.epsi.mspr.recycl.repository.service.V_DEMANDEService;
import fr.epsi.mspr.recycl.repository.service.V_TOURNEEEMPLOYEService;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class V_TOURNEE_EMPLOYEImpl implements V_TOURNEEEMPLOYEService {

    V_TOURNEE_EMPLOYERepository v_tournee_employeRepository;

    @Autowired
    public V_TOURNEE_EMPLOYEImpl(V_TOURNEE_EMPLOYERepository v_tournee_employeRepository) {
        this.v_tournee_employeRepository = v_tournee_employeRepository;
    }

    public List<V_TOURNEE_EMPLOYE> findTourneeByEmploye(String login) throws Exception {
        Iterable<V_TOURNEE_EMPLOYE> list = v_tournee_employeRepository.findTourneeByEmploye(login);
        List<V_TOURNEE_EMPLOYE> myList = Lists.newArrayList(list);
        if(!myList.isEmpty()){
            return myList;
        }
        else{
            throw new Exception("aucune tournee");
        }
    }

}
