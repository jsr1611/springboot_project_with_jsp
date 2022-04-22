package com.example.springboot_project_with_jsp.repository.model;

import lombok.*;

@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@ToString
public class BookData {
    private String isbn;
    private String name;
    private String author;
}
