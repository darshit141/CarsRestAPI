package com.cars.Service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cars.Entity.Cars;
import com.cars.Repository.CarsRepository;

@Service
public class CarsService {
	@Autowired
	private CarsRepository repo;
	
	public List<Cars> GetCars() {
		
		return repo.findAll();
		
	}
	
	
	public Cars PostCars( Cars car) {
	
		 repo.save(car);
		return car;
	}

	public Cars GetCars(Cars car) {
		
		return (Cars) repo.findAll();	
	}
	
	public Cars UpdateCars(Cars car)
	{
		
	return  	this.repo.save(car);
		
	}
	
	public List<Cars> DeleteCars(Cars car)
	{
		int i = car.getId();
		repo.getReferenceById(i);
		repo.deleteById(i);
		return repo.findAll();
		
		  
	}
	

	

}
