package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.EMPLOYE;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.transaction.annotation.Transactional;

public interface EmployeRepository extends CrudRepository<EMPLOYE, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE EMPLOYE SET blocked = 1 Where login=?1")
    void updateBlocked(String login);
}