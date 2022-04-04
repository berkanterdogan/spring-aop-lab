package com.berkanterdogan.lab.springaoplab.repository;

import com.berkanterdogan.lab.springaoplab.domain.Car;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CarRepository extends JpaRepository<Car, Long> {
}
