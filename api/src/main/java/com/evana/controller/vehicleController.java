package com.evana.controller;

import com.evana.entity.Vehicles;
import com.evana.services.vehicleServices;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://mocker.egen.io", maxAge = 3600)
@RestController
@RequestMapping(value = "/vehicles")
public class vehicleController {
    @Autowired
    vehicleServices Services;

    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicles> listAll() {
        return Services.listAll();

    }

    @RequestMapping(method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_UTF8_VALUE, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicles insert(@RequestBody Vehicles ves) {
        return Services.insert(ves);
    }

    @RequestMapping(method = RequestMethod.PUT, path = "/{vin}",
            consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,
            produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicles update(@PathVariable("vin") String vehid,@RequestBody Vehicles ves){
        return Services.update(vehid,ves);

    }
    @RequestMapping(method = RequestMethod.GET, path = "/{vin}", consumes = MediaType.APPLICATION_JSON_UTF8_VALUE,produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public Vehicles findOne(@PathVariable("vin") String vehid){
        return Services.findOne(vehid);
    }

}




