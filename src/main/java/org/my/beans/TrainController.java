package org.my.beans;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.my.persistence.crud.Depot;
import org.my.persistence.entities.Train;

import javax.ejb.Local;
import javax.ejb.Stateless;
import javax.enterprise.context.SessionScoped;
import javax.faces.bean.ManagedBean;
import javax.faces.bean.ViewScoped;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

/**
 * Created by al on 22.02.2016.
 */

@ManagedBean
@SessionScoped
public class TrainController implements Serializable {

    private final Logger log = LogManager.getLogger(TrainController.class);

    Depot depot = new Depot();

    private Long id;
    private String trainName;
    private Date trainReleaseDate;
    private float trainCost;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

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
        log.debug(new Train(trainName, new Date(), trainCost));
        depot.add(new Train(trainName, new Date(), trainCost));
    }

    public List<Train> getAllTrains(){
        return depot.getAll();
    }

    public void deleteTrain(Long id){
        depot.delete(id);
    }

    public void updateTrain(){
        Train train = depot.get(id);
        train.setName(trainName);
        train.setCost(trainCost);
        train.setReleaseDate(new Date());
        depot.update(train);
    }
}
