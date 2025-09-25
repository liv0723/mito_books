package com.mito.books.service;

import com.mito.books.model.Book;
import com.mito.books.repository.BookRepositoryImpl;
import com.mito.books.repository.IBookRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

@Service
//@RequiredArgsConstructor
public class BookServiceImpl implements IBookService{

    private final IBookRepository iBookRepository;

    public BookServiceImpl(BookRepositoryImpl iBookRepository) {
        this.iBookRepository = iBookRepository;
    }

    @Override
    public Book getBookById(Integer id) {
        if (id > 0) {
            return this.iBookRepository.getBookById(id);
        }
        return new Book(0, "Not Book");
    }
}
