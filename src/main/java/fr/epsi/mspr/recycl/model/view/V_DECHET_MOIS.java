package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ComposeKey.class)
public class V_DECHET_MOIS {

    @Id
    private int mois;

    @Id
    private int year;

    @Id
    private String type;

    private int quantite;
}
