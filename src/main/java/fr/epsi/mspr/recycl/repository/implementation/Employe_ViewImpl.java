package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.Employe_View;
import fr.epsi.mspr.recycl.repository.Employe_ViewRepository;
import fr.epsi.mspr.recycl.repository.service.Employe_ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class Employe_ViewImpl implements Employe_ViewService {

    private Employe_ViewRepository employe_viewRepository;

    @Autowired
    public Employe_ViewImpl(Employe_ViewRepository employe_viewRepository) {
        this.employe_viewRepository = employe_viewRepository;
    }

    public Employe_View findByLogin(String login, String pass) throws Exception {
        Employe_View p = employe_viewRepository.findByLogin(login, pass);
        if(p != null){
            return p;
        }
        throw new Exception("Not Found");
    }
}
