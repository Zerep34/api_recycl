package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface V_DEMANDE_Repository extends CrudRepository<V_DEMANDE, Integer> {

    @Query("select d from V_DEMANDE d WHERE d.nodemande = ?1")
    Iterable<V_DEMANDE> findDetail(int num);
}
