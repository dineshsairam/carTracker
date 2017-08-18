package com.evana.services;

import com.evana.entity.Vehicles;

import java.util.List;

public interface vehicleServices {
List<Vehicles> listAll();
Vehicles insert(Vehicles ves);
Vehicles update(String vin, Vehicles ves);
Vehicles findOne(String vehid);
}

