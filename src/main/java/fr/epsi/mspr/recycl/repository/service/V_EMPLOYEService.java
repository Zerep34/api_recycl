package fr.epsi.mspr.recycl.repository.service;

import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import org.springframework.stereotype.Service;

@Service
public interface V_EMPLOYEService {

    V_EMPLOYE findByLoginWithPass(String login, String pass) throws Exception;

    V_EMPLOYE findByLogin(String login) throws Exception;
}
