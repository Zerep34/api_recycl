package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class V_GET_DATA {

    @Id
    private Date Date;

    private Float TauxRemplissageMoyen;

}
