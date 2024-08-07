package com.library.repository;

import org.springframework.stereotype.Repository;

@Repository
public class BookRepository {
    public void saveBook() {
        // Logic to save a book
        System.out.println("Book saved");
    }
}
