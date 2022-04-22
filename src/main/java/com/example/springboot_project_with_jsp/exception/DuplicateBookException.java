package com.example.springboot_project_with_jsp.exception;

import com.example.springboot_project_with_jsp.dto.Book;
import lombok.Getter;

@Getter
public class DuplicateBookException extends RuntimeException{

    private final Book book;

    public DuplicateBookException(Book book){
        this.book = book;
    }

}
