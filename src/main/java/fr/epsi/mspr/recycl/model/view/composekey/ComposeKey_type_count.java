package fr.epsi.mspr.recycl.model.view.composekey;

import java.io.Serializable;

public class ComposeKey_type_count implements Serializable {

    private String type;

    private int total;

    public ComposeKey_type_count() {
    }

    public ComposeKey_type_count(String type, int total) {
        this.type = type;
        this.total = total;
    }
}
