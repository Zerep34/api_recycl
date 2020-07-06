package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.ENTREPRISE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;

public interface V_ENTREPRISE_Repository extends CrudRepository<ENTREPRISE, Integer> {

    @Query(value = "{call plus_demande(:id)}", nativeQuery = true)
    Iterable<ENTREPRISE> plus_demande(@Param("id") int entr);
}
