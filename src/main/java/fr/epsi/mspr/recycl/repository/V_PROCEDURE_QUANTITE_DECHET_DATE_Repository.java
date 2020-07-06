package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_PROCEDURE_QUANTITE_DECHET_DATE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface V_PROCEDURE_QUANTITE_DECHET_DATE_Repository extends CrudRepository<V_PROCEDURE_QUANTITE_DECHET_DATE, Integer> {

    @Query(value = "{call quantite_dechet_date(:debut, :fin, :antenne)}", nativeQuery = true)
    Iterable<V_PROCEDURE_QUANTITE_DECHET_DATE> quantite_dechet_date(@Param("debut") Date debut, @Param("fin") Date fin, @Param("antenne") String antenne);
}
