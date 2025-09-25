package com.mito.books.repository;

import com.mito.books.model.Book;

public interface IBookRepository {

    public Book getBookById(Integer id);
}
