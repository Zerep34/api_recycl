package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_DEMANDE;
import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface V_DEMANDERepository extends CrudRepository<V_DEMANDE, Integer> {

}
