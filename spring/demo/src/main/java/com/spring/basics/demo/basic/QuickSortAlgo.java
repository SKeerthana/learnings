package com.spring.basics.demo.basic;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
@Qualifier("quick")
public class QuickSortAlgo implements SortAlog {
    public int[] sort(int[] numbers){
        return numbers;
    }
}
