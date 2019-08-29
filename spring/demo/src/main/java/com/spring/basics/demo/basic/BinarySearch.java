package com.spring.basics.demo.basic;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Service
@Scope(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class BinarySearch {

    private Logger LOGGER = LoggerFactory.getLogger(this.getClass());
    @Autowired
    SortAlog sortAlog;

    public int search(int[] numbers, int numberToSearch){
        int[] sortedNumbers = sortAlog.sort(numbers);
        return 3;
    }

    @PostConstruct
    public void postConstruct() {
        LOGGER.info("Post contruct");
    }

    @PreDestroy
    public void preDestroy() {
        LOGGER.info("***** Pre destroy ******");
    }
}
