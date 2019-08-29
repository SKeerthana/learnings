package com.example.springboot.basics.springboot;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringbootApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext applicationContext = SpringApplication.run(SpringbootApplication.class, args);
		for (String bean : applicationContext.getBeanDefinitionNames()) {
			System.out.println(bean);
		}
	}

}
