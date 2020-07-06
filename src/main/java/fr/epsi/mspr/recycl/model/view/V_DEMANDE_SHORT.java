package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class V_DEMANDE_SHORT {

    @Id
    private int nodemande;

    private String nom;

    private Date date;

    public V_DEMANDE_SHORT() {
    }

    public V_DEMANDE_SHORT(int nodemande, String nom, Date date) {
        this.nodemande = nodemande;
        this.nom = nom;
        this.date = date;
    }
}
