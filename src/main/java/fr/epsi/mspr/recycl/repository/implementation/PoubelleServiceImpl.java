package fr.epsi.mspr.recycl.repository.implementation;

import fr.epsi.mspr.recycl.model.PoubelleReleve;
import fr.epsi.mspr.recycl.repository.PoubelleRepository;
import fr.epsi.mspr.recycl.repository.service.PoubelleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.Date;

@Service
public class PoubelleServiceImpl implements PoubelleService {

    private PoubelleRepository poubelleRepository;

    @Autowired
    public PoubelleServiceImpl(PoubelleRepository poubelleRepository) {
        this.poubelleRepository = poubelleRepository;
    }

    public PoubelleReleve findByName(String name) throws Exception {
        PoubelleReleve p = poubelleRepository.findByName(name);
        if(p != null){
            return p;
        }
        throw new Exception("Not Found");
    }

    @Transactional
    public void deleteByName(String name) {
        poubelleRepository.deleteByName(name);
    }

    @Transactional
    public void update(String name, Date date, int FillLevel, String oldName){
        this.poubelleRepository.update(name, date, FillLevel, oldName);
    }

    @Override
    public PoubelleReleve save(PoubelleReleve poubelle) throws Exception {
        if(poubelleRepository.findByName(poubelle.getName()) != null){
            throw new Exception("User already exists");
        }
        this.poubelleRepository.save(poubelle);
        return poubelle;
    }

    @Override
    public Iterable<PoubelleReleve> findAll(){return this.poubelleRepository.findAll();}

}
