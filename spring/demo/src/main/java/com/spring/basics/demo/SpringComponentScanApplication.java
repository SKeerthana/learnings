package com.spring.basics.demo;

import com.spring.basics.componentscan.ComponentDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("com.spring.basics.componentscan")
public class SpringComponentScanApplication {
	static private Logger LOGGER = LoggerFactory.getLogger(SpringComponentScanApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringComponentScanApplication.class, args);
		ComponentDAO componentDAO = context.getBean(ComponentDAO.class);
		LOGGER.info("### Component DAO - {}", componentDAO);

	}

}
