package com.library;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import com.library.service.BookService;

public class LibraryManagementApplication {
    public static void main(String[] args) {
        // Load the Spring context
        ApplicationContext context = new ClassPathXmlApplicationContext("applicationContext.xml");

        // Retrieve the BookService bean
        BookService bookService = (BookService) context.getBean("bookService");

        // Test the dependency injection and aspect logging
        bookService.performService();

        // Verify the dependency injection by checking the output
        System.out.println("BookService bean created: " + bookService);
    }
}

// Output:
// BookService is now using BookRepository: com.library.repository.BookRepository@539d019
// void com.library.service.BookService.performService() executed in 13ms
// BookService bean created: com.library.service.BookService@21fd5faa