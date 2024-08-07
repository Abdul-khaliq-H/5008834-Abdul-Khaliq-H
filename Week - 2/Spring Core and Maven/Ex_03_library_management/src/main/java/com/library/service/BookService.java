package com.library.service;

import com.library.repository.BookRepository;

public class BookService {
    private BookRepository bookRepository;

    // Setter for dependency injection
    public void setBookRepository(BookRepository bookRepository) {
        this.bookRepository = bookRepository;
    }

    // Service methods can be added here
    public void performService() {
        System.out.println("BookService is now using BookRepository: " + bookRepository);
    }
}
