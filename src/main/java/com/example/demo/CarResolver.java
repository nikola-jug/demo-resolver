package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

@Component
public class CarResolver {

	@Autowired
	List<CarInterface> carInterfaceList;

	Map<String, CarInterface> carInterfaceMap;

	public CarInterface getCarInterface(Car car) {
		return carInterfaceMap.get(car.getClass().getName());
	}

	@PostConstruct
	public void constructMap() {
		carInterfaceMap = new HashMap<>();
		carInterfaceList.forEach(carInterface ->
				carInterfaceMap.put(carInterface.getImplementationClass().getName(), carInterface)
		);
	}
}
