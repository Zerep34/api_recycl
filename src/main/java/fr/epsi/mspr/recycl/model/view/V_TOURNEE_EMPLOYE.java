package fr.epsi.mspr.recycl.model.view;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.util.Date;

@Entity
public class V_TOURNEE_EMPLOYE {

    @Id
    private int id;

    private String login;

    private int camion;

    private Date date_heure;

    public V_TOURNEE_EMPLOYE(int id, String login, int camion, Date date) {
        this.id = id;
        this.login = login;
        this.camion = camion;
        this.date_heure = date;
    }

    public V_TOURNEE_EMPLOYE() {
    }

    public int getId() {
        return id;
    }

    public String getLogin() {
        return login;
    }

    public int getCamion() {
        return camion;
    }

}
