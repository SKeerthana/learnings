package com.spring.basics.demo;

import com.spring.basics.demo.cdi.CDIExample;
import com.spring.basics.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringCDIExampleApplication {
	static private Logger LOGGER = LoggerFactory.getLogger(SpringCDIExampleApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringCDIExampleApplication.class, args);

		CDIExample cdiExample = context.getBean(CDIExample.class);
		LOGGER.info("CDI service - {}", cdiExample);
		LOGGER.info("CDI DAO - {}", cdiExample.getCdiExampleDAO());

	}

}
