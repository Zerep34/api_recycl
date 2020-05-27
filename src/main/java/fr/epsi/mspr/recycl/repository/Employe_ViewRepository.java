package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.Employe_View;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

public interface Employe_ViewRepository extends CrudRepository<Employe_View, Integer> {

    @Query("SELECT p from Employe_View p Where p.login=?1 and p.motdepasse=?2")
    Employe_View findByLogin(String name, String pass);
}
