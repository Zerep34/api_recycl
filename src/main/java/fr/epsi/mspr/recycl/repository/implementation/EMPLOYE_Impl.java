package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.repository.Employe_Repository;
import fr.epsi.mspr.recycl.repository.service.EMPLOYE_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EMPLOYE_Impl implements EMPLOYE_Service {

    private Employe_Repository employeRepository;

    @Autowired
    public EMPLOYE_Impl(Employe_Repository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Transactional
    @Modifying
    public void updateBlocked(String login){
        this.employeRepository.updateBlocked(login);
    }
}
