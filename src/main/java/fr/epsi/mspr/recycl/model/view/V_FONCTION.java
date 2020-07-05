package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class V_FONCTION {

    @Id
    private int id;

    private String libelle;


    public int getId() {
        return id;
    }

    public String getLibelle() {
        return libelle;
    }
}
