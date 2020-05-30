package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_DEMANDE_SHORT;
import fr.epsi.mspr.recycl.repository.V_DEMANDERepository;
import fr.epsi.mspr.recycl.repository.V_DEMANDE_SHORT_Repository;
import fr.epsi.mspr.recycl.repository.service.V_DEMANDEService;
import fr.epsi.mspr.recycl.repository.service.V_DEMANDE_SHORT_Service;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.Date;
import java.util.List;

@Service
public class V_DEMANDE_SHORT_Impl implements V_DEMANDE_SHORT_Service {

    private V_DEMANDE_SHORT_Repository v_demande_shortRepository;

    @Autowired
    public V_DEMANDE_SHORT_Impl(V_DEMANDE_SHORT_Repository v_demande_shortRepository){
        this.v_demande_shortRepository = v_demande_shortRepository;
    }

    public List<V_DEMANDE_SHORT> findDemande(Date date) throws Exception {
        Iterable<V_DEMANDE_SHORT> list = v_demande_shortRepository.findDemande(date);
        List<V_DEMANDE_SHORT> myList = Lists.newArrayList(list);
        if(!myList.isEmpty()){
            return myList;
        }
        else{
            throw new Exception("aucune demande");
        }
    }

}
