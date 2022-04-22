package com.example.springboot_project_with_jsp.service;

import com.example.springboot_project_with_jsp.dto.Book;

import java.util.Collection;

public interface BookService {
    Collection<Book> getBooks();
    Book addBook(Book book);
}
