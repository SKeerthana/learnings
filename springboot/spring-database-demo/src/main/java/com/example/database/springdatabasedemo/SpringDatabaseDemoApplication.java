package com.example.database.springdatabasedemo;

import com.example.database.springdatabasedemo.jdbc.PersonJdbcDao;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringDatabaseDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(SpringDatabaseDemoApplication.class);
	@Autowired
	PersonJdbcDao personJdbcDao;

	public static void main(String[] args) {
		SpringApplication.run(SpringDatabaseDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("All users \n {}" ,personJdbcDao.findAll());
		logger.info("Users - {}" ,personJdbcDao.findById(10001));
	}
}
