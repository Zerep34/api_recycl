package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.EMPLOYE;
import fr.epsi.mspr.recycl.model.view.V_EMPLOYE_COUNT;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;
import org.springframework.data.repository.query.Param;
import org.springframework.transaction.annotation.Transactional;

public interface V_EMPLOYE_COUNT_Repository extends CrudRepository<V_EMPLOYE_COUNT, Integer> {

    @Query(value = "{call emp_tournee(:name)}", nativeQuery = true)
    Iterable<V_EMPLOYE_COUNT> emp_tournee(@Param("name") int nb);
}
