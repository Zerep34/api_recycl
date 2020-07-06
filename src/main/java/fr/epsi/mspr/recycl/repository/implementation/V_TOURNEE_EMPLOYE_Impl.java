package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.view.V_TOURNEE_EMPLOYE;
import fr.epsi.mspr.recycl.repository.V_TOURNEE_EMPLOYE_Repository;
import fr.epsi.mspr.recycl.repository.service.V_TOURNEEEMPLOYE_Service;
import org.assertj.core.util.Lists;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class V_TOURNEE_EMPLOYE_Impl implements V_TOURNEEEMPLOYE_Service {

    V_TOURNEE_EMPLOYE_Repository v_tournee_employeRepository;

    @Autowired
    public V_TOURNEE_EMPLOYE_Impl(V_TOURNEE_EMPLOYE_Repository v_tournee_employeRepository) {
        this.v_tournee_employeRepository = v_tournee_employeRepository;
    }

    public List<V_TOURNEE_EMPLOYE> findTourneeByEmploye(String login) throws Exception {
        Iterable<V_TOURNEE_EMPLOYE> list = v_tournee_employeRepository.findTourneeByEmploye(login);
        List<V_TOURNEE_EMPLOYE> myList = Lists.newArrayList(list);
        if (!myList.isEmpty()) {
            return myList;
        } else {
            throw new Exception("aucune tournee");
        }
    }

}
