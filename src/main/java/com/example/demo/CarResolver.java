package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class CarResolver {

	@Autowired
	List<CarInterface> carInterfaceList;

	public CarInterface getCarInterface(Car car) {
		final CarInterface[] bla = new CarInterface[1];
		carInterfaceList.forEach(carInterface -> {
			if (carInterface.getImplementationClass().getName().equals(car.getClass().getName())) {
				bla[0] = carInterface;
			}
		});
		return bla[0];
	}
}
