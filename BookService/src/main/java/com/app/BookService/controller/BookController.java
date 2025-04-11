package com.app.BookService.controller;

import com.app.BookService.model.Book;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/book")
public class BookController {

    List<Book> books=new ArrayList<>();
    {
        books.add(new Book(101,"IKIGAI",315.70));
        books.add( new Book(102,"POWER OF MONEY",100.0));
        books.add(new Book(103,"ALCHEMIST",150.15));
    }

    @GetMapping("/all")
    public List<Book> getAll(){
        return books;
    }

    @GetMapping("/{id}")
    public Book getBookById(@PathVariable int id){
        Book book=books.stream().filter(e->e.getBookId()==id).findFirst().orElse(null);
        return book;
    }

}
