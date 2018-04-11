package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarResolver {

	@Autowired
	List<CarInterface> carInterfaceList;

	public CarInterface getCarInterface(Car car) {
		return carInterfaceList
				.stream()
				.filter(carInterface -> carInterface.getImplementationClass().getName().equals(car.getClass().getName()))
				.findFirst()
				.orElse(null);
	}
}
