package com.evana.repository;

import com.evana.entity.Vehicles;
import org.springframework.stereotype.Repository;


import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class vehicleRepositoryImplt implements  vehicleRepository{

    @PersistenceContext
    private EntityManager  entityManager;

    public Vehicles findOne(String vin) {
        return entityManager.find(Vehicles.class,vin);
    }

    public Vehicles update(Vehicles ves) {
return entityManager.merge(ves);
    }

    public List<Vehicles> listAll() {

      //  TypedQuery<Vehicles>  query = entityManager.createNamedQuery("Vehicles.listAll",Vehicles.class);
       TypedQuery<Vehicles> query = entityManager.createQuery("SELECT  ves from Vehicles ves",Vehicles.class);

        return query.getResultList();

    }
    public Vehicles insert(Vehicles ves) {
        entityManager.persist(ves);
        return ves;
    }

}
