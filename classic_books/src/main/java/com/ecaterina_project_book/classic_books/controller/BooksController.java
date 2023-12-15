package com.ecaterina_project_book.classic_books.controller;

import com.ecaterina_project_book.classic_books.dto.Book;
import com.ecaterina_project_book.classic_books.service.BookService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/books")
public class BooksController {
    private final BookService bookService;

    public BooksController(BookService bookService) {
        this.bookService = bookService;
    }

    @GetMapping
    public List<Book> getBooks(){

        return bookService.getKnownBooks();


    }

    @GetMapping
    @RequestMapping("/{id}")
    public Book getBookById(@PathVariable("id")String id){
        return bookService.getBookById(id);
    }
}
