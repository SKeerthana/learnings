package com.spring.basics.demo;

import com.spring.basics.demo.basic.BinarySearch;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.basics.demo.basic")
public class SpringPropertiesApplication {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringPropertiesApplication.class, args);

		BinarySearch binarySearch = context.getBean(BinarySearch.class);
		System.out.println("Binary search");
		System.out.println(binarySearch);

		BinarySearch binarySearch1 = context.getBean(BinarySearch.class);
		System.out.println("Binary search1");
		System.out.println(binarySearch1);

		int result = binarySearch.search(new int[]{3, 4}, 3);
		System.out.println("Result - " + result);

		context.registerShutdownHook();
	}

}
