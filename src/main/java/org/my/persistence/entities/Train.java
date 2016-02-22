package org.my.persistence.entities;

import javax.persistence.*;
import java.util.Date;

/**
 * Created by al on 21.02.2016.
 */
@Entity
@Table(name = "trains")
@NamedQuery(name = "Train.getAll", query = "select tr from Train tr order by id")
public class Train {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "release_date")
    @Temporal(TemporalType.DATE)
    private Date releaseDate;

    @Column(name = "cost")
    private float cost;

    public Train(String name, Date releaseDate, float cost) {
        this.name = name;
        this.releaseDate = releaseDate;
        this.cost = cost;
    }

    public Train() {
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Date getReleaseDate() {
        return releaseDate;
    }

    public void setReleaseDate(Date releaseDate) {
        this.releaseDate = releaseDate;
    }

    public float getCost() {
        return cost;
    }

    public void setCost(float cost) {
        this.cost = cost;
    }

    @Override
    public String toString() {
        return "Train{"+
                " name = " + name +
                ", release date = " + releaseDate +
                ", cost = " + cost + "}";
    }
}
