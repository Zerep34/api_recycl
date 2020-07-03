package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_PROCEDURE_QUANTITE_DECHET_DATE;
import fr.epsi.mspr.recycl.model.view.V_PROCEDURE_QUANTITE_DECHET_DATE_NATIONAL;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface V_PROCEDURE_QUANTITE_DECHET_DATE_NATIONAL_Repository extends CrudRepository<V_PROCEDURE_QUANTITE_DECHET_DATE_NATIONAL, Integer> {

    @Query(value = "{call quantite_dechet_date_national(:debut, :fin)}", nativeQuery = true)
    Iterable<V_PROCEDURE_QUANTITE_DECHET_DATE_NATIONAL> quantite_dechet_date_national(@Param("debut") Date debut, @Param("fin") Date fin);
}
