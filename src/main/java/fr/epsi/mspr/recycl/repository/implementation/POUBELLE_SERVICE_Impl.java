package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.PoubelleReleve;
import fr.epsi.mspr.recycl.repository.Poubelle_Repository;
import fr.epsi.mspr.recycl.repository.service.POUBELLE_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class POUBELLE_SERVICE_Impl implements POUBELLE_Service {

    private Poubelle_Repository poubelleRepository;

    @Autowired
    public POUBELLE_SERVICE_Impl(Poubelle_Repository poubelleRepository) {
        this.poubelleRepository = poubelleRepository;
    }

    public PoubelleReleve findByName(String name) throws Exception {
        PoubelleReleve p = poubelleRepository.findByName(name);
        if (p != null) {
            return p;
        }
        throw new Exception("Not Found");
    }

    @Transactional
    public void deleteByName(String name) {
        poubelleRepository.deleteByName(name);
    }

    @Transactional
    public void update(String name, Date date, int FillLevel, String oldName) {
        this.poubelleRepository.update(name, date, FillLevel, oldName);
    }

    @Override
    public PoubelleReleve save(PoubelleReleve poubelle) throws Exception {
        this.poubelleRepository.save(poubelle);
        return poubelle;
    }

    @Override
    public Iterable<PoubelleReleve> findAll() {
        return this.poubelleRepository.findAll();
    }

}
