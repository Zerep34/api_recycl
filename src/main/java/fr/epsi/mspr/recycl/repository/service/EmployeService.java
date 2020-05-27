package fr.epsi.mspr.recycl.repository.service;

import org.springframework.stereotype.Service;

@Service
public interface EmployeService {

    void updateBlocked(String login) throws Exception;
}
