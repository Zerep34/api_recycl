package fr.epsi.mspr.recycl.model;

import com.mysql.cj.x.protobuf.MysqlxDatatypes;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;

@Entity
public class Poubelle {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private int SIRET;

    @NotNull
    private int type_dechet_id ;

    @NotNull
    private String nom ;

    public Poubelle() {
    }

    public Poubelle(int id, int SIRET, int type_dechet_id, String nom) {
        this.id = id;
        this.SIRET = SIRET;
        this.type_dechet_id = type_dechet_id;
        this.nom = nom;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public int getSIRET() {
        return SIRET;
    }

    public void setSIRET(int SIRET) {
        this.SIRET = SIRET;
    }

    public int getType_dechet_id() {
        return type_dechet_id;
    }

    public void setType_dechet_id(int type_dechet_id) {
        this.type_dechet_id = type_dechet_id;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }
}
