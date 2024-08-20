package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter method for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    public void performService() {
        // Utilize the BookRepository for some operation
        System.out.println("Service is being performed using BookRepository.");
        bookRepository.accessData();
    }
}