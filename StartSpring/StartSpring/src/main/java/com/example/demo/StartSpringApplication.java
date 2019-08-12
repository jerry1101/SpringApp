package com.example.demo;

import org.springframework.context.ApplicationContext;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import jerry.services.CustomerService;

@ComponentScan({"jerry.services","jerry.dataaccess"})
@SpringBootApplication
public class StartSpringApplication {

	public static void main(String[] args) {
		
		ApplicationContext context = SpringApplication.run(StartSpringApplication.class, args);
        CustomerService service = context.getBean(CustomerService.class);
        System.out.println(service.getName(1));
	}

}
