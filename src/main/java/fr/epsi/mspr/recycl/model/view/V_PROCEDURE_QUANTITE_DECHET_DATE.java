package fr.epsi.mspr.recycl.model.view;

import fr.epsi.mspr.recycl.model.view.composekey.ComposeKey;
import fr.epsi.mspr.recycl.model.view.composekey.ComposeKey_quantite_dechet_date;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ComposeKey_quantite_dechet_date.class)
public class V_PROCEDURE_QUANTITE_DECHET_DATE {
    @Id
    private String nom;

    @Id
    private String type;

    @Id
    private int total;
}
