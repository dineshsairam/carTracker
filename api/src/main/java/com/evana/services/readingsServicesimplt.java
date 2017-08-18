package com.evana.services;

import com.evana.entity.Readings;
import com.evana.repository.readingsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class readingsServicesimplt implements readingsServices{

    @Autowired
    readingsRepository repo;

    public Readings insert(Readings res) {
        return repo.insert(res);
    }

    public List<Readings> showAll() {
        return repo.showAll();
    }
}
