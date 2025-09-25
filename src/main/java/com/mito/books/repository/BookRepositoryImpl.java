package com.mito.books.repository;

import com.mito.books.model.Book;
import org.springframework.stereotype.Repository;

@Repository
public class BookRepositoryImpl implements IBookRepository{
    @Override
    public Book getBookById(Integer id) {
        return new Book(id, "Harry Potter\s%d".formatted(id));
    }
}
