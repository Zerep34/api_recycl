package fr.epsi.mspr.recycl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;


@Entity
public class EMPLOYE {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long noemp;

    @NotNull
    private String nom;

    @NotNull
    private String prenom;

    @NotNull
    private Date date_naissance;

    @NotNull
    private String adresse;

    @NotNull
    private int antenne;

    @NotNull
    private int ville;

    @NotNull
    private int fonction;

    @NotNull
    private String motdepasse;

    @NotNull
    private boolean blocked;

    @NotNull
    private String login;

    @NotNull
    private Date date_mdp;

    public EMPLOYE() {
    }

    public EMPLOYE(@NotNull String nom, @NotNull String prenom, @NotNull Date date_naissance, @NotNull String adresse, @NotNull int antenne, @NotNull int ville, @NotNull int fonction, @NotNull String motdepasse, @NotNull boolean blocked, @NotNull String login, @NotNull Date date_mdp) {
        this.nom = nom;
        this.prenom = prenom;
        this.date_naissance = date_naissance;
        this.adresse = adresse;
        this.antenne = antenne;
        this.ville = ville;
        this.fonction = fonction;
        this.motdepasse = motdepasse;
        this.blocked = blocked;
        this.login = login;
        this.date_mdp = date_mdp;
    }

    public long getNoemp() {
        return noemp;
    }

    public void setNoemp(long noemp) {
        this.noemp = noemp;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getPrenom() {
        return prenom;
    }

    public void setPrenom(String prenom) {
        this.prenom = prenom;
    }

    public Date getDate_naissance() {
        return date_naissance;
    }

    public void setDate_naissance(Date date_naissance) {
        this.date_naissance = date_naissance;
    }

    public String getAdresse() {
        return adresse;
    }

    public void setAdresse(String adresse) {
        this.adresse = adresse;
    }

    public int getAntenne() {
        return antenne;
    }

    public void setAntenne(int antenne) {
        this.antenne = antenne;
    }

    public int getVille() {
        return ville;
    }

    public void setVille(int ville) {
        this.ville = ville;
    }

    public int getFonction() {
        return fonction;
    }

    public void setFonction(int fonction) {
        this.fonction = fonction;
    }

    public String getMotdepasse() {
        return motdepasse;
    }

    public void setMotdepasse(String motdepasse) {
        this.motdepasse = motdepasse;
    }

    public boolean isBlocked() {
        return blocked;
    }

    public void setBlocked(boolean blocked) {
        this.blocked = blocked;
    }

    public String getLogin() {
        return login;
    }

    public void setLogin(String login) {
        this.login = login;
    }

    public Date getDate_mdp() {
        return date_mdp;
    }

    public void setDate_mdp(Date date_mdp) {
        this.date_mdp = date_mdp;
    }
}
