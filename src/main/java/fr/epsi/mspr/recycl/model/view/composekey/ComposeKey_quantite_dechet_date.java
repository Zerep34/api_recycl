package fr.epsi.mspr.recycl.model.view.composekey;

import java.io.Serializable;

public class ComposeKey_quantite_dechet_date implements Serializable {

    private String nom;

    private String type;

    private int total;

    public ComposeKey_quantite_dechet_date() {
    }

    public ComposeKey_quantite_dechet_date(String nom, String type, int total) {
        this.nom = nom;
        this.type = type;
        this.total = total;
    }
}
