package com.globomatics.bike.controllers;

import com.globomatics.bike.models.Bike;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.ArrayList;
import java.util.List;

@RestController
@RequestMapping("/api/v1/bikes")
public class BikesController {

    @GetMapping
    public List<Bike> getBikesList() {
        List<Bike> bikes = new ArrayList<>();
        return bikes;
    }

    @GetMapping("{/id}")
    public Bike getBike(@PathVariable("id") long id) {
        return new Bike();
    }

    @PostMapping
    @ResponseStatus(HttpStatus.OK)
    public void createBike(@RequestBody Bike bike) {

    }

}
