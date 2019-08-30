package com.example.database.springdatabasedemo.jpa;

import com.example.database.springdatabasedemo.entity.User;
import org.springframework.stereotype.Repository;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.TypedQuery;
import javax.transaction.Transactional;
import java.util.List;

@Repository
@Transactional
public class UserJpaRepository {

    @PersistenceContext
    private EntityManager entityManager;

    public User findById(int id){
        return entityManager.find(User.class, id);
    }

    public User update(User user){
        return entityManager.merge(user);
    }

    public User insert(User user){
        return entityManager.merge(user);
    }

    public void deleteById(int id){
        User user = findById(id);
        entityManager.remove(user);
    }

    public List<User> findAll(){
        TypedQuery<User> namedQuery = entityManager.createNamedQuery("find_all_persons", User.class);
        return namedQuery.getResultList();
    }

}
