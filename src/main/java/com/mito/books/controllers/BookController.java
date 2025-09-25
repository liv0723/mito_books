package com.mito.books.controllers;

import com.mito.books.model.Book;
import com.mito.books.service.BookServiceImpl;
import com.mito.books.service.IBookService;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
//@RequiredArgsConstructor
public class BookController {
    private final IBookService iBookService;

    public BookController(BookServiceImpl iBookService) {
        this.iBookService = iBookService;
    }

    @GetMapping("/book")
    public Book getBook() {
        return this.iBookService.getBookById(6);
    }
}
