package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class V_DEMANDE_NON_INSCRITE {

    @Id
    private int id;

    private Date date;

    private int nodemande;

    private int type_dechet;

    private int quantite;

    private String devise;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getNodemande() {
        return nodemande;
    }

    public void setNodemande(int nodemande) {
        this.nodemande = nodemande;
    }

    public int getType_dechet() {
        return type_dechet;
    }

    public void setType_dechet(int type_dechet) {
        this.type_dechet = type_dechet;
    }

    public int getQuantite() {
        return quantite;
    }

    public void setQuantite(int quantite) {
        this.quantite = quantite;
    }

    public String getDevise() {
        return devise;
    }

    public void setDevise(String devise) {
        this.devise = devise;
    }
}
