package com.example.demo;

public interface CarInterface<T extends Car> {
	String getCar(T car);

	Class getImplementationClass();
}
