package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.nt.sbeans.Vehicle;

@SpringBootApplication
public class BootProj02DependencyInjectionAppApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj02DependencyInjectionAppApplication.class, args);
		Vehicle vehicle = ctx.getBean("vehicle",Vehicle.class);
		vehicle.journey("Hyd","Delhi");
		ctx.close();
	}

}
