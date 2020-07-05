package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class V_POUBELLE {

    @Id
    private String name;


    public String getName() {
        return name;
    }
}
