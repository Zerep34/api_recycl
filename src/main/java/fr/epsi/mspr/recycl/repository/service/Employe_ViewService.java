package fr.epsi.mspr.recycl.repository.service;

import fr.epsi.mspr.recycl.model.Employe_View;
import org.springframework.stereotype.Service;

@Service
public interface Employe_ViewService {

    Employe_View findByLogin(String login, String pass) throws Exception;
}
