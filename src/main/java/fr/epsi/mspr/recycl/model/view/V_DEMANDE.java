package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class V_DEMANDE {

    @Id
    private int nodemande;

    private Date date;

    private int tournee;

    private String nom;

    private String type;

    private int quantite;

    private String devise;

    public int getNodemande() {
        return nodemande;
    }

    public Date getDate() {
        return date;
    }

    public int getTournee() {
        return tournee;
    }

    public String getNom() {
        return nom;
    }

    public String getType() {
        return type;
    }

    public int getQuantite() {
        return quantite;
    }
}
