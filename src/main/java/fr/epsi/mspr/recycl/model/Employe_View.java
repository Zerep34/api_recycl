package fr.epsi.mspr.recycl.model;

import lombok.Getter;
import lombok.Setter;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class Employe_View {

    @NotNull
    private String motdepasse;

    @NotNull
    private boolean blocked;

    @Id
    @NotNull
    private String login;

    @NotNull
    private Date date_mdp;

    public String getMotdepasse() {
        return motdepasse;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public String getLogin() {
        return login;
    }

    public Date getDate_mdp() {
        return date_mdp;
    }
}
