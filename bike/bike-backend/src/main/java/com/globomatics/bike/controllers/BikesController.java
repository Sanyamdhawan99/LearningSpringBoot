package com.globomatics.bike.controllers;

import com.globomatics.bike.models.Bike;
import com.globomatics.bike.repositories.BikeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @Autowired
    private BikeRepository bikeRepository;

    @GetMapping
    public List<Bike> getBikesList() {
        return bikeRepository.findAll();
    }

    @GetMapping("/{id}")
    public Bike getBike(@PathVariable("id") long id) {
        return bikeRepository.getOne(id);
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createBike(@RequestBody Bike bike) {
        bikeRepository.save(bike);
    }

}
