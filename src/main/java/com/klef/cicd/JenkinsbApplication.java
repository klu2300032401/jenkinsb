package com.klef.cicd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JenkinsbApplication extends SpringBootServletInitializer{

	public static void main(String[] args) {
		SpringApplication.run(JenkinsbApplication.class, args);
		System.out.println("Project is running...");
	}

}
