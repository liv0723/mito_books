package com.mito.books.service;

import com.mito.books.model.Book;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService{


    @Override
    public Book getBookById(Integer id) {
        if (id > 0) {
            return new Book(id, "Harry Potter %d".formatted(id));
        }
        return new Book(0, "Not Book");
    }
}
