package com.spring.basics.demo;

import com.spring.basics.demo.scope.PersonDAO;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class SpringScopeExampleApplication {
	static private Logger LOGGER = LoggerFactory.getLogger(SpringScopeExampleApplication.class);

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(SpringScopeExampleApplication.class, args);
		PersonDAO personDAO = context.getBean(PersonDAO.class);
		PersonDAO personDAO1 = context.getBean(PersonDAO.class);
		LOGGER.info("Person - {}", personDAO);
		LOGGER.info("Person JDBC {}", personDAO.getJdbcConnection());
		LOGGER.info("Person JDBC1 {}", personDAO.getJdbcConnection());
		LOGGER.info("Person1 - {}", personDAO1);
		LOGGER.info("{}", personDAO1.getJdbcConnection());

	}

}
