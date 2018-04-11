package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class CarController {

	@Autowired
	CarResolver carResolver;

	@RequestMapping(value = "/cars/opel", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> getOpelCar() {
		Opel opel = new Opel();
		return new ResponseEntity<>(carResolver.getCarInterface(opel).getCar(opel), HttpStatus.OK);
	}

	@RequestMapping(value = "/cars/golf", method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_VALUE)
	@ResponseBody
	public ResponseEntity<String> getGolfCar() {
		Golf golf = new Golf();
		return new ResponseEntity<>(carResolver.getCarInterface(golf).getCar(golf), HttpStatus.OK);
	}
}
