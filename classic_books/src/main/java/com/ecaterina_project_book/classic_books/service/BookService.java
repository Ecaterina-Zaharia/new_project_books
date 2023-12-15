package com.ecaterina_project_book.classic_books.service;

import com.ecaterina_project_book.classic_books.dto.Book;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {
    private static final List<Book> KNOWN_BOOKS = List.of(new Book("1", "Margaret Mitchell", "Gone with the Wind", 100),
            new Book("2", "Louisa May Alcott, Ella Bailey", "Little women", 35),
            new Book("3", "Charlotte Brontë", "Jane Eyre", 65),
            new Book ("4", "Jane Austen", "Pride and Prejudice", 85),
            new Book("5", "Frances Hodgson Burnett", "Secret Garden", 45),
            new Book("6", "Emily Brontë", "Wuthering heights", 112),
            new Book("7", "Daniel Defoe", "Moll Flanders", 150));

    public List<Book> getKnownBooks(){
        return KNOWN_BOOKS;
    }

    public  Book getBookById(String id){
        return KNOWN_BOOKS.stream()
                .filter(book -> id.equals(book.getId()))
                .findFirst()
                .orElseThrow();
    }
}
