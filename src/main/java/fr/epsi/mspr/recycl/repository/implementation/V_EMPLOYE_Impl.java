package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import fr.epsi.mspr.recycl.repository.V_EMPLOYE_Repository;
import fr.epsi.mspr.recycl.repository.service.V_EMPLOYE_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class V_EMPLOYE_Impl implements V_EMPLOYE_Service {

    private V_EMPLOYE_Repository V_EMPLOYE_Repository;

    @Autowired
    public V_EMPLOYE_Impl(V_EMPLOYE_Repository V_EMPLOYE_Repository) {
        this.V_EMPLOYE_Repository = V_EMPLOYE_Repository;
    }

    public V_EMPLOYE findByLogin(String login) throws Exception {
        V_EMPLOYE p = V_EMPLOYE_Repository.findByLogin(login);
        if(p != null){
            return p;
        }
        throw new Exception("No User Found");
    }

    public V_EMPLOYE findByLoginWithPass(String login, String pass) throws Exception {
        V_EMPLOYE p = V_EMPLOYE_Repository.findByLoginWithPass(login, pass);
        if(p != null){
            return p;
        }
        throw new Exception("No Pass Found");
    }
}
