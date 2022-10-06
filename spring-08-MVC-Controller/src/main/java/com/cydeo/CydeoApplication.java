package com.cydeo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.aop.AopAutoConfiguration;

@SpringBootApplication
//@SpringBootApplication(exclude = {AopAutoConfiguration.class}) we can exclude dependencies if wont use
public class CydeoApplication {

	public static void main(String[] args) {
		SpringApplication.run(CydeoApplication.class, args);
	}

}
