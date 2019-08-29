package com.spring.bootstrap.example;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class BinarySearch {
    @Autowired
    private SortAlgo sortAlgo;

    public int search(int[] numbers, int numberToSearch) {
        int[] sortedNumbers = sortAlgo.sort(numbers);
        return 2;
    }
}
