package com.spring.basics.demo.properties;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

@Service
public class PropertyService {
    @Value("${external.service.url}")
    private String url;

    public String getUrl() {
        return url;
    }
}
