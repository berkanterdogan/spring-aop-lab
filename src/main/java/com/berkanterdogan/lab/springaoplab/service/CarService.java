package com.berkanterdogan.lab.springaoplab.service;

import com.berkanterdogan.lab.springaoplab.domain.Car;

import java.util.List;

public interface CarService {


    void deleteAll();

    void saveAll(Iterable<Car> cars);

    List<Car> findAll();

    Car save(Car car);
}
