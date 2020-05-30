package fr.epsi.mspr.recycl.repository;

import fr.epsi.mspr.recycl.model.PoubelleReleve;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.CrudRepository;

import java.util.Date;

public interface Poubelle_Repository extends CrudRepository<PoubelleReleve, Integer> {

    @Query("SELECT p from PoubelleReleve p Where p.name=?1")
    PoubelleReleve findByName(String name);

    @Modifying
    @Query("DELETE from PoubelleReleve p WHERE p.name=?1")
    void deleteByName(String name);

    @Modifying
    @Query("Update PoubelleReleve Set name=?1, date=?2, FillLevel=?3 Where name=?4")
    void update(String name, Date date, int FillLevel, String oldName);
}
