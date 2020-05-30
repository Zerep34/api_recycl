package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.view.V_EMPLOYE;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface V_EMPLOYE_Repository extends CrudRepository<V_EMPLOYE, Integer> {

    @Query("SELECT p from V_EMPLOYE p Where p.login=?1")
    V_EMPLOYE findByLogin(String name);

    @Query("SELECT p from V_EMPLOYE p Where p.login=?1 and p.motdepasse=?2")
    V_EMPLOYE findByLoginWithPass(String name, String pass);
}
