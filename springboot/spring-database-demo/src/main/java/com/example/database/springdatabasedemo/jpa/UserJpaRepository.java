package com.example.database.springdatabasedemo.jpa;

import com.example.database.springdatabasedemo.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.transaction.Transactional;

@Repository
@Transactional
public class UserJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public User findById(int id){
        return entityManager.find(User.class, id);
    }
}
