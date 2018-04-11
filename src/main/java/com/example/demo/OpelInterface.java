package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class OpelInterface implements CarInterface<Opel> {

	@Override
	public String getCar(Opel car) {
		return "Opel interface called!";
	}

	@Override
	public Class getImplementationClass() {
		return Opel.class;
	}
}
