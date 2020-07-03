package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.ENTREPRISE_Short;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface ENTREPRISE_Short_Repository extends CrudRepository<ENTREPRISE_Short, Integer> {

    @Query(value = "Select e.siret, e.nom FROM ENTREPRISE e", nativeQuery = true)
    Iterable<ENTREPRISE_Short> getAllEntreprise();
}
