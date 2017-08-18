package com.evana.services;

import com.evana.entity.Readings;

import java.util.List;

public interface readingsServices {

    List<Readings> showAll();
    Readings insert(Readings res);
}
