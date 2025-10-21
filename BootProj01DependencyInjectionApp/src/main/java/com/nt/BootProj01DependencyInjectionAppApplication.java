package com.nt;

import java.time.LocalDate;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.Bean;

import com.nt.sbean.SeasonFinder;

@SpringBootApplication
public class BootProj01DependencyInjectionAppApplication {
	
	@Bean(name="ld")
	public LocalDate createDate() {
		return LocalDate.now();
	}

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(BootProj01DependencyInjectionAppApplication.class, args);
		SeasonFinder bean = ctx.getBean("sf",SeasonFinder.class);
		
		String season = bean.findSeason();
		
		System.out.println("Season Name::"+season);
		
		ctx.close();
	}

}
