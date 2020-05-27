package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.Employe_View;
import fr.epsi.mspr.recycl.repository.EmployeRepository;
import fr.epsi.mspr.recycl.repository.Employe_ViewRepository;
import fr.epsi.mspr.recycl.repository.service.EmployeService;
import fr.epsi.mspr.recycl.repository.service.Employe_ViewService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class EmployeImpl implements EmployeService {

    private EmployeRepository employeRepository;

    @Autowired
    public EmployeImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Transactional
    public void updateBlocked(String login){
        this.employeRepository.updateBlocked(login);
    }
}
