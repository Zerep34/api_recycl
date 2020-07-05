package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class V_VILLE {

    @Id
    private int idville;

    private String nom;


    public int getIdVille() {
        return idville;
    }

    public String getNom() {
        return nom;
    }
}
