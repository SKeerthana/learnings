package com.example.database.springdatabasedemo.springdata;

import com.example.database.springdatabasedemo.entity.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserSpringDataRepository extends JpaRepository<User, Integer>{
}
