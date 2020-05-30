package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_DEMANDE_NON_TRAITEE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface V_DEMANDE_NON_TRAITEE_Repository extends CrudRepository<V_DEMANDE_NON_TRAITEE, Integer> {
}