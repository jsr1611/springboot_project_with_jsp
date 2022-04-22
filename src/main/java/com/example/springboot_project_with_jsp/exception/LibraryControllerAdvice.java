package com.example.springboot_project_with_jsp.exception;

import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;
import org.springframework.web.servlet.ModelAndView;

@ControllerAdvice
public class LibraryControllerAdvice {

    @ExceptionHandler(value = DuplicateBookException.class)
    public ModelAndView duplicateBookException(DuplicateBookException e){
        final ModelAndView modelAndView = new ModelAndView();
        modelAndView.addObject("ref", e.getBook().getIsbn());
        modelAndView.addObject("object", e.getBook());
        modelAndView.addObject("message", "Duplicate Book Addition!");
        modelAndView.setViewName("error-book");
        return modelAndView;
    }
}
