package com.serviceb.teachers;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.cloud.netflix.eureka.EnableEurekaClient;


@SpringBootApplication
//@EnableEurekaClient
public class TeachersApplication {

	public static void main(String[] args) {
		SpringApplication.run(TeachersApplication.class, args);
	}

}
