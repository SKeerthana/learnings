package com.spring.basics.demo.basic;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Service;

@Service
@Primary
public class BubbleSortAlgo implements SortAlog {
    public int[] sort(int[] numbers){
        return numbers;
    }
}
