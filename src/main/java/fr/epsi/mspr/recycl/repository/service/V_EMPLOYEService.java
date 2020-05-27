package fr.epsi.mspr.recycl.repository.service;

import fr.epsi.mspr.recycl.model.V_EMPLOYE;
import org.springframework.stereotype.Service;

@Service
public interface V_EMPLOYEService {

    V_EMPLOYE findByLogin(String login, String pass) throws Exception;
}
