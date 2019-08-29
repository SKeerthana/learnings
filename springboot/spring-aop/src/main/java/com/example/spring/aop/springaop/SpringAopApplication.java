package com.example.spring.aop.springaop;

import com.example.spring.aop.springaop.business.ExampleBusiness;
import com.example.spring.aop.springaop.business.ExampleBusiness1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringAopApplication implements CommandLineRunner{

	@Autowired
	private ExampleBusiness exampleBusiness;

	@Autowired
	private ExampleBusiness1 exampleBusiness1;

	public static void main(String[] args) {
		SpringApplication.run(SpringAopApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(exampleBusiness.calculate());
		System.out.println(exampleBusiness1.calculate());

	}
}
