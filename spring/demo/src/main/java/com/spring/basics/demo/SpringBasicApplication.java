package com.spring.basics.demo;

import com.spring.basics.demo.properties.PropertyService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.PropertySource;

@SpringBootApplication
@PropertySource("classpath:app.properties")
public class SpringBasicApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringBasicApplication.class, args);

		PropertyService propertyService = context.getBean(PropertyService.class);
		System.out.println(propertyService.getUrl());

		context.registerShutdownHook();
	}

}
