package fr.epsi.mspr.recycl.repository.service;

import fr.epsi.mspr.recycl.model.PoubelleReleve;
import org.springframework.stereotype.Service;

import java.util.Date;

@Service
public interface POUBELLE_Service {

    PoubelleReleve findByName(String name) throws Exception;

    void deleteByName(String name);

    void update(String name, Date date, int FillLevel, String oldName);

    PoubelleReleve save(PoubelleReleve user) throws Exception;

    Iterable<PoubelleReleve> findAll();
}
