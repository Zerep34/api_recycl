package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.EMPLOYE;
import fr.epsi.mspr.recycl.model.ENTREPRISE;
import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface V_ENTREPRISERepository extends CrudRepository<ENTREPRISE, Integer> {

    @Query(value = "{call plus_demande(:name)}", nativeQuery = true)
    Iterable<ENTREPRISE> plus_demande(@Param("name") String entr);
}