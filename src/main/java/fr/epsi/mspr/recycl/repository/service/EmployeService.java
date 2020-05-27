package fr.epsi.mspr.recycl.repository.service;

import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

@Service
public interface EmployeService {

    @Transactional
    @Modifying
    void updateBlocked(String login) throws Exception;

}
