package com.library.librarymanagement.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.library.librarymanagement.entity.Book;

@Repository
public interface BookRepository extends JpaRepository<Book, Long> {
}
