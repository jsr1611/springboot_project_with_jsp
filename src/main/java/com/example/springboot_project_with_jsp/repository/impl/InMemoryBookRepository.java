package com.example.springboot_project_with_jsp.repository.impl;

import com.example.springboot_project_with_jsp.repository.BookRepository;
import com.example.springboot_project_with_jsp.repository.model.BookData;

import java.util.Collection;
import java.util.Collections;
import java.util.Map;
import java.util.Optional;

public class InMemoryBookRepository implements BookRepository {

    private final Map<String, BookData> storedBooks;
    public InMemoryBookRepository(Map<String, BookData> storedBooks){
        this.storedBooks = storedBooks;
    }


    @Override
    public Collection<BookData> findAll() {
        if(storedBooks.isEmpty())
            return Collections.emptyList();

        return storedBooks.values();
    }

    @Override
    public Optional<BookData> findById(String isbn) {
        return Optional.ofNullable(storedBooks.get(isbn));
    }

    @Override
    public BookData add(BookData book) {
        storedBooks.put(book.getIsbn(), book);
        return book;
    }
}
