package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_GET_DATA;
import fr.epsi.mspr.recycl.model.view.V_POUBELLE;
import fr.epsi.mspr.recycl.model.view.V_PROCEDURE_QUANTITE_DECHET_DATE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

import java.util.Date;

public interface V_GET_DATA_Repository extends CrudRepository<V_GET_DATA, Integer> {

    @Query(value = "{call getDataFromBin(:name)}", nativeQuery = true)
    Iterable<V_GET_DATA> getDataFromBin(@Param("name") String name);
}
