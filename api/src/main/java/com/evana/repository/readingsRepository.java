package com.evana.repository;

import com.evana.entity.Readings;
//import com.evana.entity.Vehicles;

import java.util.List;

public interface readingsRepository {


    List<Readings> showAll();
Readings insert(Readings res);
}
