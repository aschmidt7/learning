package com.chicho.learn;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication	
public class DemoWebApplication {

	public static void main(String[] args) {	
		SpringApplication.run(DemoWebApplication.class, args);
		System.out.println("hola");
	}

}
