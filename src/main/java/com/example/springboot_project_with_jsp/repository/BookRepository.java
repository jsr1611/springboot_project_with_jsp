package com.example.springboot_project_with_jsp.repository;


import com.example.springboot_project_with_jsp.repository.model.BookData;

import java.util.Collection;
import java.util.Optional;

public interface BookRepository{
    Collection<BookData> findAll();

    Optional<BookData> findById(String isbn);

    BookData add(BookData book);
}
