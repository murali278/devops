package com.infy.DemoSpringBoot;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractApplicationContext;

import com.infy.service.CustomerServiceImpl;

@SpringBootApplication(scanBasePackages={"com.infy.service"})
public class DemoSpringBootApplication {
	
	public static void main(String[] args) {
		
		CustomerServiceImpl service = null;
		AbstractApplicationContext context = (AbstractApplicationContext) SpringApplication.run(DemoSpringBootApplication.class, args);
		
		service= context.getBean(CustomerServiceImpl.class);
		
		System.out.println(service.createCustomer());
		System.out.println(service.fetchCustomer());
	}

}
