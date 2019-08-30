package com.example.database.springdatabasedemo.jdbc;

import com.example.database.springdatabasedemo.entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.jdbc.core.BeanPropertyRowMapper;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class PersonJdbcDao {
    @Autowired
    private JdbcTemplate jdbcTemplate;

    public List<Person> findAll(){
        return jdbcTemplate.query("select * from person", new PersonRowMapper());
    }

    public Person findById(int id){
        return jdbcTemplate.queryForObject("select * from person where id=?", new Object[] {id},new BeanPropertyRowMapper<>(Person.class));
    }
}
