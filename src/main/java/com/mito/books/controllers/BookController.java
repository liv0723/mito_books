package com.mito.books.controllers;

import com.mito.books.model.Book;
import com.mito.books.service.BookServiceImpl;
import com.mito.books.service.IBookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/v1")
public class BookController {
    private IBookService iBookService;

    @GetMapping("/book")
    public Book getBook() {
        this.iBookService = new BookServiceImpl();

        return this.iBookService.getBookById(2);
    }
}
