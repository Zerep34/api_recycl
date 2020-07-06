package fr.epsi.mspr.recycl.model.view;

import fr.epsi.mspr.recycl.model.view.composekey.ComposeKey_type_count;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.IdClass;

@Entity
@IdClass(ComposeKey_type_count.class)
public class V_PROCEDURE_QUANTITE_DECHET_DATE_NATIONAL {
    @Id
    private String type;

    @Id
    private int total;
}
