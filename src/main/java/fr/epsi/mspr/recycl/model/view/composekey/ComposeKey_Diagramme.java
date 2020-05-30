package fr.epsi.mspr.recycl.model.view.composekey;

import java.io.Serializable;
import java.util.Date;

public class ComposeKey_Diagramme implements Serializable {
    private float total;

    private Date jour;

    private String name;

    public ComposeKey_Diagramme() {
    }

    public ComposeKey_Diagramme(float total, Date jour, String name) {
        this.total = total;
        this.jour = jour;
        this.name = name;
    }
}
