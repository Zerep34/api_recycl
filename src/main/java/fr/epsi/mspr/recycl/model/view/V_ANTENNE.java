package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class V_ANTENNE {

    @Id
    private int noantenne;

    private String nom;


    public int getNoAntenne() {
        return noantenne;
    }

    public String getNom() {
        return nom;
    }
}
