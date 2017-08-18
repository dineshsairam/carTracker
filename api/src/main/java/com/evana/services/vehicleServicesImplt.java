package com.evana.services;

import com.evana.entity.Vehicles;
import com.evana.repository.vehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class vehicleServicesImplt implements vehicleServices {

    @Autowired
    vehicleRepository vehiclerepository;
@Transactional(readOnly = true)
    public List<Vehicles> listAll() {
        return vehiclerepository.listAll();
    }

    public Vehicles findOne(String vin) {
        return vehiclerepository.findOne(vin);
    }

    public Vehicles update(String vin, Vehicles ves)
    {
        Vehicles alreadyExists = vehiclerepository.findOne(vin);
    if(alreadyExists != null){
        return vehiclerepository.update(ves);
    }
    else {
        return  vehiclerepository.insert(ves);
    }
    }

    @Transactional
    public Vehicles insert(Vehicles ves) {
        return vehiclerepository.insert(ves);
    }
}
