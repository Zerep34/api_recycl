package fr.epsi.mspr.recycl.model.view;

import fr.epsi.mspr.recycl.model.view.composekey.ComposeKey;
import fr.epsi.mspr.recycl.model.view.composekey.ComposeKey_Diagramme;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;
import java.util.Date;

@Entity
@IdClass(ComposeKey_Diagramme.class)
public class V_DIAGRAMME_ADD {

    @Id
    private float total;

    @Id
    private Date jour;

    @Id
    private String name;
}
