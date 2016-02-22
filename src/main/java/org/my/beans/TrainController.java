package org.my.beans;

import org.my.persistence.crud.Depot;
import org.my.persistence.entities.Train;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.Date;

/**
 * Created by al on 22.02.2016.
 */

@ManagedBean
@SessionScoped
public class TrainController implements Serializable {

    Depot depot = new Depot();

    private String trainName;
    private Date trainReleaseDate;
    private float trainCost;

    public String getTrainName() {
        return trainName;
    }

    public void setTrainName(String trainName) {
        this.trainName = trainName;
    }

    public Date getTrainReleaseDate() {
        return trainReleaseDate;
    }

    public void setTrainReleaseDate(Date trainReleaseDate) {
        this.trainReleaseDate = trainReleaseDate;
    }

    public float getTrainCost() {
        return trainCost;
    }

    public void setTrainCost(float trainCost) {
        this.trainCost = trainCost;
    }

    public void addTrain(){
        System.out.println(new Train(trainName, new Date(), trainCost));
        depot.add(new Train(trainName, new Date(), trainCost));
    }
}
