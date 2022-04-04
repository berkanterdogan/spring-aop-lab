package com.berkanterdogan.lab.springaoplab.bootstrap;

import com.berkanterdogan.lab.springaoplab.domain.Car;
import com.berkanterdogan.lab.springaoplab.service.CarService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import java.util.List;

@Slf4j
@RequiredArgsConstructor
@Component
public class SpringAopLabApplicationLoader implements CommandLineRunner {

    private final CarService carService;

    @Override
    public void run(String... args) throws Exception {
        carService.deleteAll();

        Car.CarBuilder carBuilder = Car.builder();
        Car mercedes = carBuilder.name("Mercedes").colour(Car.CarColourEnum.BLACK).type(Car.CarTypeEnum.SEDAN).build();
        Car bmw = carBuilder.name("BMW").colour(Car.CarColourEnum.RED).type(Car.CarTypeEnum.HATCHBACK).build();
        Car opel = carBuilder.name("Opel").colour(Car.CarColourEnum.WHITE).type(Car.CarTypeEnum.SUV).build();
        Car ford = carBuilder.name("Ford").colour(Car.CarColourEnum.BLUE).type(Car.CarTypeEnum.HATCHBACK).build();

        try {
            carService.save(mercedes);
        } catch (Exception e) {
        }

        carService.saveAll(List.of(mercedes, bmw, opel, ford));
        carService.findAll();
    }
}
