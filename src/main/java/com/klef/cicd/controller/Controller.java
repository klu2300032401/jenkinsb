package com.klef.cicd.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class Controller {
	@GetMapping("/")
	public String hi() {
		return "Welcome to jenkins backend";
	}
	@GetMapping("/hello")
	public String hello() {
		return "Hello";
	}

}
