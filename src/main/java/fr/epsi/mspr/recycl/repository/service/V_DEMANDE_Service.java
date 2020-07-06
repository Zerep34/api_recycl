package fr.epsi.mspr.recycl.repository.service;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import org.springframework.stereotype.Service;

@Service
public interface V_DEMANDE_Service {

    Iterable<V_DEMANDE> findDetail(int num) throws Exception;
}
