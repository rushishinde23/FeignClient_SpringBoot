package com.app.StudentService.consumer;

import com.app.StudentService.dto.Book;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

@FeignClient(name = "BOOK-SERVICE")
public interface StudentRestConsumer {

    @GetMapping("/book/all")
    public List<Book> getAll();

    @GetMapping("/book/{id}")
    public Book getBookById(@PathVariable int id);
}
