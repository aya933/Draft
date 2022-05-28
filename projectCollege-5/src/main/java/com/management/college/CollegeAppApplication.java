package com.management.college;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

//Spring Boot @SpringBootApplication annotation is used to mark a configuration
//class that declares one or more @Bean methods and also triggers auto-configuration
//and component scanning. It’s the same as declaring a class with @Configuration,
//@EnableAutoConfiguration and @ComponentScan annotations

@SpringBootApplication
public class CollegeAppApplication  {

	public static void main(String[] args) {
		SpringApplication.run(CollegeAppApplication.class, args);
	}

	
	

}
