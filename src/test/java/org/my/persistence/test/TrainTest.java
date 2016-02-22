package org.my.persistence.test;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.junit.Test;
import org.my.persistence.crud.Depot;
import org.my.persistence.entities.Train;

import java.util.Date;
import java.util.List;

/**
 * Created by al on 21.02.2016.
 */
public class TrainTest {

    private final Logger log = LogManager.getLogger(TrainTest.class);
    Depot depot = new Depot();

    @Test
    public void testSaveRecord() throws Exception{
        Train train = new Train("Pinky", new Date(), 432013.43f);
        Train dbTrain = depot.add(train);
        log.debug(dbTrain);
    }

    @Test
    public void testDeleteRecord() throws Exception{
        Train train = new Train("Jhon", new Date(), 673026.49f);
        Train dbTrain = depot.add(train);
        depot.delete(dbTrain.getId());
    }

    @Test
    public void testSelect() throws Exception{
        Train train = new Train("Steamy", new Date(), 111066.99f);
        Train dbTrain = depot.add(train);
        Train storedTrain = depot.get(dbTrain.getId());
        log.debug(storedTrain);
    }

    @Test
    public void testUpdate() throws Exception{
        Train train = new Train("Megatron", new Date(), 666666.88f);
        Train dbTrain = depot.add(train);
        dbTrain.setCost(0);
        depot.update(dbTrain);
        Train dbTrain2 = depot.get(dbTrain.getId());
        log.debug(dbTrain2);
    }

    @Test
    public void testGetAll() throws Exception{
        Train train1 = new Train("Clara", new Date(), 111111.11f);
        Train train2 = new Train("Megan", new Date(), 222222.22f);
        Train train3 = new Train("Julia", new Date(), 333333.33f);

        depot.add(train1);
        depot.add(train2);
        depot.add(train3);

        List<Train> trains = depot.getAll();

        for (Train train : trains) {
            log.debug(train);
        }
    }
}
