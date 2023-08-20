package com.example.firstapp;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CarApi {

    private CarManager carManager;

    @Autowired
    public CarApi(CarManager carManager) {
        this.carManager = carManager;
    }

    @GetMapping("/cars")
    public List<Car> getCars() {
        return carManager.getCarList();
    }

    @PostMapping("/cars")
    public boolean addCars(@RequestBody Car car) {
        return carManager.addCar(car);
    }

}
