package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.repository.EmployeRepository;
import fr.epsi.mspr.recycl.repository.service.EmployeService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public class EmployeImpl implements EmployeService {

    private EmployeRepository employeRepository;

    @Autowired
    public EmployeImpl(EmployeRepository employeRepository) {
        this.employeRepository = employeRepository;
    }

    @Transactional
    @Modifying
    public void updateBlocked(String login){
        this.employeRepository.updateBlocked(login);
    }
}
