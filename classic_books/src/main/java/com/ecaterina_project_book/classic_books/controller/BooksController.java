package com.ecaterina_project_book.classic_books.controller;

import com.ecaterina_project_book.classic_books.dto.Book;
import com.ecaterina_project_book.classic_books.service.BookService;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping ("/{id}")
    public Book getBookById(@PathVariable("id") String id){

        return bookService.getBookById(id);
    }

    @GetMapping
    @RequestMapping("/{title}")
    public Book getBookByTitle(@PathVariable("title") String title){
        return bookService.getBookByTitle(title);
    }

    @GetMapping
    @RequestMapping("/{author}")
    public Book getBookByAuthor(@PathVariable("author") String author){
        return bookService.getBookByAuthor(author);
    }

    @DeleteMapping ("/deletion/{id}")
    public String deleteBookByID(@PathVariable("id") String id) {
        bookService.deleteBookById(id);
        return "The book with id " + id + " is deleted";
    }
}
