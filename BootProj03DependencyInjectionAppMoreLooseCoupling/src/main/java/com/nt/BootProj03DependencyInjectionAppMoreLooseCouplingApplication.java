package com.nt;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ImportResource;

import com.nt.sbeans.Batsman;

@SpringBootApplication
@ImportResource("com/nt/cfgs/applicationContext.xml")
public class BootProj03DependencyInjectionAppMoreLooseCouplingApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj03DependencyInjectionAppMoreLooseCouplingApplication.class, args);
		Batsman batsman = ctx.getBean("batman",Batsman.class);
		String msg = batsman.batting();
		System.out.println(msg);
		ctx.close();
	}

}
