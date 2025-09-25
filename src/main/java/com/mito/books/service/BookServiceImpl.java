package com.mito.books.service;

import com.mito.books.model.Book;
import com.mito.books.repository.BookRepositoryImpl;
import com.mito.books.repository.IBookRepository;
import org.springframework.stereotype.Service;

@Service
public class BookServiceImpl implements IBookService{

    private IBookRepository iBookRepository;


    @Override
    public Book getBookById(Integer id) {
        if (id > 0) {
            this.iBookRepository = new BookRepositoryImpl();
            return this.iBookRepository.getBookById(id);
        }
        return new Book(0, "Not Book");
    }
}
