package com.example.database.springdatabasedemo;

import com.example.database.springdatabasedemo.jpa.UserJpaRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringJpaDemoApplication implements CommandLineRunner{

	private Logger logger = LoggerFactory.getLogger(SpringJpaDemoApplication.class);

	@Autowired
	UserJpaRepository userJpaRepository;

	public static void main(String[] args) {
		SpringApplication.run(SpringJpaDemoApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		logger.info("Users - {}" , userJpaRepository.findById(10001));
	}
}
