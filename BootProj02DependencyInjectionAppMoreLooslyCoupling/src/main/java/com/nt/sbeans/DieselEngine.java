package com.nt.sbeans;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component("dEngine")
//@Primary
public final class DieselEngine implements IEngine {

	public DieselEngine() {
		System.out.println("DieselEngine.DieselEngine()");
	}
	
	@Override
	public void start() {
		System.out.println("DieselEngine Started");

	}

	@Override
	public void stop() {
		System.out.println("DieselEngine Stoped");
	}
}
