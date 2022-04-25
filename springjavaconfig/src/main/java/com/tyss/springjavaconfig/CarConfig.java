package com.tyss.springjavaconfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
//@Component
//@ComponentScan(basePackages = "com.tyss.springjavaconfig")
public class CarConfig {
	@Bean(name = "audi")
	public Car getCar() {
		Car car = new Car();
		car.setPrice(100000);
		car.setModelName("A5");
		car.setBrand("Audi");
		car.setEngine(getEngine());
		return car;
	}

	@Bean(name = "engine")
	public Engine getEngine() {
		Engine engine = new Engine();
		engine.setName("Audi Engine");
		engine.setCapacity(1000);
		return engine;
	}

	@Bean(name = "Lambogini")
	public Car getCar1() {
		Car car = new Car();
		car.setPrice(100000);
		car.setModelName("A1");
		car.setBrand("Lambogini");
		car.setEngine(getEngine1());
		return car;
	}

	@Bean
	public Engine getEngine1() {
		Engine engine1 = new Engine();
		engine1.setName("Lambogini Engine");
		engine1.setCapacity(1000);
		return engine1;
	}

}
