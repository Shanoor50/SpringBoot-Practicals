package com.nt.sbeans;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component("batman")
public class Batsman {
	
	@Autowired
	@Qualifier("bat")
	private ICricketBat bat;
	
	public Batsman() {
		System.out.println("Batsman.Batsman()");
	}
	
	public String batting() {
		System.out.println("Batsman.batting()");
		int runs = bat.scoreRuns();
		return "Batsman has Scored  "+runs+"  runs";
	}

}
