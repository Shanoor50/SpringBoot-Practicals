package com.nt.sbeans;

import org.springframework.stereotype.Component;

@Component("pEngine")
public final class PetrolEngine implements IEngine {

	public PetrolEngine() {
		System.out.println("PetrolEngine.PetrolEngine()");
	}
	
	@Override
	public void start() {
		System.out.println("PetrolEngine Started");
	}

	@Override
	public void stop() {
		System.out.println("PetrolEngine Stoped");
	}
}
