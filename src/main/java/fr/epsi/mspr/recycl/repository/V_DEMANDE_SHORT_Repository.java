package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE_SHORT;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface V_DEMANDE_SHORT_Repository extends CrudRepository<V_DEMANDE_SHORT, Integer> {

    @Query("select d from V_DEMANDE_SHORT d WHERE d.date > ?1")
    Iterable<V_DEMANDE_SHORT> findDemande(Date date);
}
