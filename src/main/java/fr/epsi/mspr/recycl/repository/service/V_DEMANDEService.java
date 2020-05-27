package fr.epsi.mspr.recycl.repository.service;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface V_DEMANDEService {

    Iterable<V_DEMANDE> findTournee(Date date) throws Exception;
}
