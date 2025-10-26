package com.nt.sbeans;

import java.util.Random;

import org.springframework.stereotype.Component;

@Component("ssbat")
public class SSBat implements ICricketBat {
	
	public SSBat() {
		System.out.println("SGBat.SGBat()");
	}

	@Override
	public int scoreRuns() {
		System.out.println("SSBat.scoreRuns()");
		int score = new Random().nextInt(200);
		return score;
	}

}
