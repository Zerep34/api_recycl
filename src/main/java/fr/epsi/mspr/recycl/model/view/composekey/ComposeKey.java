package fr.epsi.mspr.recycl.model.view.composekey;

import java.io.Serializable;

public class ComposeKey implements Serializable {
    private int mois;

    private int year;

    private String type;

    public ComposeKey() {
    }

    public ComposeKey(int mois, int year, String type) {
        this.mois = mois;
        this.year = year;
        this.type = type;
    }
}
