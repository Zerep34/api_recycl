package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface V_DEMANDE_Repository extends CrudRepository<V_DEMANDE, Integer> {

    @Query("select d from V_DEMANDE d WHERE d.date < ?1")
    Iterable<V_DEMANDE> findTournee(Date date);
}
