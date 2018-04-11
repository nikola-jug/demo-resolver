package com.example.demo;

import org.springframework.stereotype.Component;

@Component
public class VWInterface implements CarInterface<VW> {

	@Override
	public String getCar(VW car) {
		return "VW interface called!";
	}

	@Override
	public Class getImplementationClass() {
		return VW.class;
	}
}
