package com.berkanterdogan.lab.springaoplab.service.impl;

import com.berkanterdogan.lab.springaoplab.annotation.ExecutionTimeTracker;
import com.berkanterdogan.lab.springaoplab.domain.Car;
import com.berkanterdogan.lab.springaoplab.repository.CarRepository;
import com.berkanterdogan.lab.springaoplab.service.CarService;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@RequiredArgsConstructor
@Service
public class DefaultCarService implements CarService {

    private final CarRepository carRepository;

    @Override
    @Transactional
    public void deleteAll() {
        carRepository.deleteAll();
    }

    @Override
    @Transactional
    public void saveAll(Iterable<Car> cars) {
        carRepository.saveAll(cars);
    }

    @Override
    @ExecutionTimeTracker("DefaultCarService.findAll")
    @Transactional(readOnly = true)
    public List<Car> findAll() {
        return carRepository.findAll();
    }

    @Override
    public Car save(Car car) {
        throw new RuntimeException("car was not saved!");
    }
}
