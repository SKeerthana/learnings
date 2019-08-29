package com.example.springboot.basics.springboot;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Collections;
import java.util.List;

@RestController
public class BooksController {
    @GetMapping("/books")
    public List<Book> getAllBooks(){
        return Collections.singletonList(new Book(1, "Test", "author"));
    }
}
