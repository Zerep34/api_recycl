package fr.epsi.mspr.recycl.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ENTREPRISE {

    @Id
    private int siret;

    private String adresse;

    private int ville;

    private int antenne;

    private String nom;

    private int tel;
}
