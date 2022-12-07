package com.cars.Repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.cars.Entity.Cars;
@Repository
public interface CarsRepository extends JpaRepository<Cars, Integer> {

}
