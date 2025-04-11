package com.app.StudentService.controller;

import com.app.StudentService.consumer.StudentRestConsumer;
import com.app.StudentService.dto.Book;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("student")
public class StudentController {

    @Autowired
    private StudentRestConsumer consumer;

    @GetMapping("/all")
    public List<Book> getAll(){
       List<Book> books= this.consumer.getAll();
       return books;
    };

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id){
        Book book=this.consumer.getBookById(id);
        return book;
    };
}
