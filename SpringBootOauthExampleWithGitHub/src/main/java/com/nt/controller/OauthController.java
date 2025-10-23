package com.nt.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class OauthController {
	
	@GetMapping("/")
	public String getMethod() {
		return "Welcome  to Spring Oauth Security....!";
	}
}
