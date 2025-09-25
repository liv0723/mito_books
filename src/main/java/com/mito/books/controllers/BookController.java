package com.mito.books.controllers;

import com.mito.books.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {

    @GetMapping("/books")
    public Book getBook() {

        return new Book(1, "Harry Potter");

    }
}
