package com.evana.repository;

import com.evana.entity.Vehicles;

import java.util.List;

public interface vehicleRepository {
    List<Vehicles> listAll();
    Vehicles insert(Vehicles ves);
    Vehicles update(Vehicles ves);

Vehicles findOne(String vin);
}
