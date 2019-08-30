package com.example.database.springdatabasedemo.jdbc;

import com.example.database.springdatabasedemo.entity.Person;
import org.springframework.jdbc.core.RowMapper;
import org.springframework.lang.Nullable;

import java.sql.ResultSet;
import java.sql.SQLException;


public class PersonRowMapper implements RowMapper<Person> {
    @Nullable
    @Override
    public Person mapRow(ResultSet resultSet, int rowNumber) throws SQLException {
        Person person = new Person();
        person.setId(resultSet.getInt("id"));
        //map all the rest of the fields
        return person;
    }
}
