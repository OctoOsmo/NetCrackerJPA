package org.my.persistence.crud;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.my.persistence.entities.Train;

import javax.persistence.EntityManager;
import javax.persistence.Persistence;
import javax.persistence.TypedQuery;
import java.util.List;

/**
 * Created by al on 21.02.2016.
 */
public class Depot {

    private final Logger log = LogManager.getLogger(Depot.class);

    public EntityManager em = Persistence.createEntityManagerFactory("NC_JPA").createEntityManager();

    public Train add(Train train){
        em.getTransaction().begin();
        Train storedTrain = em.merge(train);
        em.getTransaction().commit();
        return storedTrain;
    }

    public Train get(Long id){
        return em.find(Train.class, id);
    }

    public void delete(Long id){
        log.debug("DEPOT Trying to delete train with id = " + id);
        em.getTransaction().begin();
        em.remove(get(id));
        em.getTransaction().commit();
    }

    public void update(Train train){
        log.debug("Trying to delete train with id = " + train.getId());
        em.getTransaction().begin();
        em.merge(train);
        em.getTransaction().commit();
    }

    public List<Train> getAll(){
        TypedQuery<Train> namedQuery = em.createNamedQuery("Train.getAll", Train.class);
        return namedQuery.getResultList();
    }
}
