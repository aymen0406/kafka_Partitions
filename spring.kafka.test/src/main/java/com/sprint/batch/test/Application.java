package com.sprint.batch.test;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;



@SpringBootApplication
//@ComponentScan(basePackages={"com.sprint.batch.test"})
public class Application {


	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	
	}
	

}
