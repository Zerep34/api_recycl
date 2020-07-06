package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_TOURNEE_EMPLOYE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface V_TOURNEE_EMPLOYE_Repository extends CrudRepository<V_TOURNEE_EMPLOYE, Integer> {

    @Query("select d from V_TOURNEE_EMPLOYE d WHERE d.login = ?1")
    Iterable<V_TOURNEE_EMPLOYE> findTourneeByEmploye(String login);
}
