package fr.epsi.mspr.recycl.model;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ENTREPRISE_Short {

    @Id
    private int siret;

    private String nom;

}
