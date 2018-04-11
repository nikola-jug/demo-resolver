package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class GoldInterface implements CarInterface<Golf> {

	@Override
	public String getCar(Golf car) {
		return "Golf interface called!";
	}

	@Override
	public Class getImplementationClass() {
		return Golf.class;
	}
}
