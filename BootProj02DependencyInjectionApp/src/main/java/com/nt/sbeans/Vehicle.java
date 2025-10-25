package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("vehicle")
public class Vehicle {
	
	@Autowired
	@Qualifier("eEngine")
	private IEngine engine;
	
	public void journey(String sourcePlace,String destPlace) {
		engine.start();
		System.out.println("Journey started at::"+sourcePlace);
		System.out.println("Journey is Going on.........!");
		engine.stop();
		System.out.println("Journey Stop at::"+destPlace);
		
	}

}
