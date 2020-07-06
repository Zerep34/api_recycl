package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_GET_DATA;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface V_GET_DATA_Repository extends CrudRepository<V_GET_DATA, Integer> {

    @Query(value = "{call getDataFromBin(:name)}", nativeQuery = true)
    Iterable<V_GET_DATA> getDataFromBin(@Param("name") String name);
}
