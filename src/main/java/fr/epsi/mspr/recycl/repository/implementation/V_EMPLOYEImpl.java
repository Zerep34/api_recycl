package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.V_EMPLOYE;
import fr.epsi.mspr.recycl.repository.V_EMPLOYERepository;
import fr.epsi.mspr.recycl.repository.service.V_EMPLOYEService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class V_EMPLOYEImpl implements V_EMPLOYEService {

    private V_EMPLOYERepository V_EMPLOYERepository;

    @Autowired
    public V_EMPLOYEImpl(V_EMPLOYERepository V_EMPLOYERepository) {
        this.V_EMPLOYERepository = V_EMPLOYERepository;
    }

    public V_EMPLOYE findByLogin(String login, String pass) throws Exception {
        V_EMPLOYE p = V_EMPLOYERepository.findByLogin(login, pass);
        if(p != null){
            return p;
        }
        throw new Exception("Not Found");
    }
}
