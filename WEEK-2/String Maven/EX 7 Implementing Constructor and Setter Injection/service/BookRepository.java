package com.library.service;

import com.library.repository.BookRepository;

public class BookRepository {
    private final BookRepository bookRepository;

    // Constructor for constructor injection
    public BookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Other service methods
}