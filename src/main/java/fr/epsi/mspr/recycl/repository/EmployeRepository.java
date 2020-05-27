package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.Employe;
import fr.epsi.mspr.recycl.model.Employe_View;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface EmployeRepository extends CrudRepository<Employe, Integer> {

    @Query("UPDATE Employe SET blocked = 1 Where login=?1")
    void updateBlocked(String login);
}
