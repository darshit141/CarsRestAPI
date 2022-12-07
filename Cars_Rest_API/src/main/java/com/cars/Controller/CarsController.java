package com.cars.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.cars.Entity.Cars;
import com.cars.Service.CarsService;

@RestController
public class CarsController {

	@Autowired
	private CarsService service;
	
@GetMapping("/cars")
	public List<Cars> GetCars() {
		
		return this.service.GetCars();
		
	}
@PostMapping("/cars")
	public Cars PostCars(@RequestBody Cars car) {
		
		return this.service.PostCars(car);
	}
@PutMapping("/cars")
	public Cars Updatecars(@RequestBody Cars car){
	
	return this.service.UpdateCars(car);
	
	}
@DeleteMapping("/cars/id")
public List<Cars> DeleteCars(@RequestBody Cars car)
{
	
	return this.service.DeleteCars(car);
	
}

	
	
	
}
