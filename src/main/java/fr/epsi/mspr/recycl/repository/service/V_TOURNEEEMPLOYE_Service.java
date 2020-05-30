package fr.epsi.mspr.recycl.repository.service;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_TOURNEE_EMPLOYE;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface V_TOURNEEEMPLOYE_Service {

    Iterable<V_TOURNEE_EMPLOYE> findTourneeByEmploye(String login) throws Exception;
}
