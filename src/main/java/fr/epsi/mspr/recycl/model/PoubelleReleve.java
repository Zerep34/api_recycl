package fr.epsi.mspr.recycl.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.validation.constraints.NotNull;
import java.util.Date;

@Entity
public class PoubelleReleve {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private long id;

    @NotNull
    private String name;

    @NotNull
    private Date date;

    @NotNull
    private int FillLevel;

    public PoubelleReleve() {
    }

    public PoubelleReleve(int id, String name, Date date, int FillLevel) {
        this.id = id;
        this.name = name;
        this.date = date;
        this.FillLevel = FillLevel;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public int getFillLevel() {
        return FillLevel;
    }

    public void setFillLevel(int fillLevel) {
        FillLevel = fillLevel;
    }
}
