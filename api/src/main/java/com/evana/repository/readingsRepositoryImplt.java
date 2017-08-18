package com.evana.repository;

import com.evana.entity.Readings;

import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import java.util.List;

@Repository
public class readingsRepositoryImplt implements readingsRepository{
    @PersistenceContext
    private EntityManager entityManager;

    public Readings insert(Readings res) {
        entityManager.persist(res);
        return res;
    }

    public List<Readings> showAll() {
        TypedQuery<Readings> query = entityManager.createQuery("SELECT res from Readings res",Readings.class);
        return query.getResultList();
    }
}
