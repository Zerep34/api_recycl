package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class V_DEMANDE_NON_TRAITEE {

    @Id
    private String nom;

    private Date date;

    private String type;

    private String prix_forfait;

    private String prix_lot;

    private int nodemande;

    private int quantite;

    private String devise;

    private int tournee;

    public V_DEMANDE_NON_TRAITEE(String nom, Date date, String type, String prix_forfait, String prix_lot, int nodemande, int quantite, String devise, int tournee) {
        this.nom = nom;
        this.date = date;
        this.type = type;
        this.prix_forfait = prix_forfait;
        this.prix_lot = prix_lot;
        this.nodemande = nodemande;
        this.quantite = quantite;
        this.devise = devise;
        this.tournee = tournee;
    }

    public V_DEMANDE_NON_TRAITEE() {
    }

    public String getNom() {
        return nom;
    }

    public Date getDate() {
        return date;
    }

    public String getType() {
        return type;
    }

    public String getPrix_forfait() {
        return prix_forfait;
    }

    public String getPrix_lot() {
        return prix_lot;
    }

    public int getNodemande() {
        return nodemande;
    }

    public String getDevise() {
        return devise;
    }

    public int getTournee() {
        return tournee;
    }
}
