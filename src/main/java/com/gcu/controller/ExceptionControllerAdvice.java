package com.gcu.controller;

import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ControllerAdvice;
import org.springframework.web.bind.annotation.ExceptionHandler;


@ControllerAdvice
public class ExceptionControllerAdvice {

    @ExceptionHandler(Exception.class)
    public String handleException(Exception ex, Model model)
    {
       // model.addObject("title", "Error Page");
        model.addAttribute("error", "Error:  An Exception was not handled in the application: " + ex.getMessage());
       // model.setViewName("error");
        model.addAttribute("title", "Error Page");
        return "error";
    } 
}
