package fr.epsi.mspr.recycl.repository.service;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_DEMANDE_SHORT;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface V_DEMANDE_SHORT_Service {

    Iterable<V_DEMANDE_SHORT> findDemande(Date date) throws Exception;
}
