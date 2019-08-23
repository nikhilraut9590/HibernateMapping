package com.hbm;

import javax.persistence.EntityManager;

import org.apache.catalina.Manager;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class HibernateMappingApplication {
			
				@Autowired
			EntityManager manager;
			
	public static void main(String[] args) {
			
		SpringApplication.run(HibernateMappingApplication.class, args);
		
	}
			public void test() {
			Employee employee = (Employee)	manager.find(Employee.class, 1);
			}
}
