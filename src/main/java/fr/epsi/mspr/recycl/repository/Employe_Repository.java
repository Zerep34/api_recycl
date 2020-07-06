package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.EMPLOYE;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface Employe_Repository extends CrudRepository<EMPLOYE, Integer> {

    @Transactional
    @Modifying
    @Query("UPDATE EMPLOYE SET blocked = 1 Where login=?1")
    void updateBlocked(String login);

    @Query(value = "{call emp_tournee(:name)}", nativeQuery = true)
    Iterable<EMPLOYE> emp_tournee(@Param("name") int nb);
}
