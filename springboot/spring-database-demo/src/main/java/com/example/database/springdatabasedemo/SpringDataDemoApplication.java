package com.example.database.springdatabasedemo;

import com.example.database.springdatabasedemo.entity.User;
import com.example.database.springdatabasedemo.springdata.UserSpringDataRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.Date;

@SpringBootApplication
public class SpringDataDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(SpringDataDemoApplication.class);

	@Autowired
	UserSpringDataRepository userJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringDataDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Users - {}" , userJpaRepository.findById(10001));
		logger.info("Inserting user - {}" , userJpaRepository.save(new User("Praba", "Chennai", new Date())));
		logger.info("Updating user - {}" , userJpaRepository.save(new User(10003, "Karan", "Chennai", new Date())));

		userJpaRepository.deleteById(10002);

		logger.info("Users - {}" , userJpaRepository.findAll());
	}
}
