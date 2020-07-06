package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.repository.V_DEMANDE_Repository;
import fr.epsi.mspr.recycl.repository.service.V_DEMANDE_Service;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class V_DEMANDE_Impl implements V_DEMANDE_Service {

    private V_DEMANDE_Repository v_demandeRepository;

    @Autowired
    public V_DEMANDE_Impl(V_DEMANDE_Repository v_demandeRepository) {
        this.v_demandeRepository = v_demandeRepository;
    }

    public List<V_DEMANDE> findDetail(int num) throws Exception {
        Iterable<V_DEMANDE> list = v_demandeRepository.findDetail(num);
        List<V_DEMANDE> myList = Lists.newArrayList(list);
        if (!myList.isEmpty()) {
            return myList;
        } else {
            throw new Exception("aucune demande");
        }
    }

}
