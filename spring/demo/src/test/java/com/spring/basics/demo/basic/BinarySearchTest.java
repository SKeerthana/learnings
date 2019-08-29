package com.spring.basics.demo.basic;

import com.spring.basics.demo.SpringBasicApplication;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringRunner;

import static org.junit.Assert.assertEquals;

@RunWith(SpringRunner.class)
@ContextConfiguration(classes = SpringBasicApplication.class)
public class BinarySearchTest
{
    @Autowired
    BinarySearch binarySearch;

    @Test
    public void basicTest() {
        assertEquals(3, binarySearch.search(new int[]{1,2,3}, 3));
    }

}