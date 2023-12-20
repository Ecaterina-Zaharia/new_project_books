package com.ecaterina_project_book.classic_books.service;

import com.ecaterina_project_book.classic_books.dto.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class BookService {
    private static final List<Book> KNOWN_BOOKS = new ArrayList<>();

    static{
        KNOWN_BOOKS.add(new Book("1", "Margaret Mitchell",
                "Gone with the Wind", "4017952317936552","classic", 64.56,
                12, true));
        KNOWN_BOOKS.add(new Book("2", "Louisa May Alcott, Ella Bailey",
                "Little women", "4017959964585087", "classic", 100.04,
                56, true));
        KNOWN_BOOKS.add(new Book("3", "Charlotte Brontë", "Jane Eyre", "4017955051524468",
                "novel", 80.86, 26, true));
        KNOWN_BOOKS.add(new Book ("4", "Jane Austen", "Pride and Prejudice", "4017950409831806",
                "novel", 90.06, 179, true));
        KNOWN_BOOKS.add(new Book("5", "Frances Hodgson Burnett", "Secret Garden", "4041370468266",
                "classic", 167.72, 32, true));
        KNOWN_BOOKS.add(new Book("6", "Emily Brontë", "Wuthering heights", "4017952946485906",
                "novel", 56.08, 3, false));
        KNOWN_BOOKS.add(new Book("7", "Daniel Defoe", "Moll Flanders", "4017954626677",
                "diary", 179.06, 33, false));
    }

    public List<Book> getKnownBooks(){

        return KNOWN_BOOKS;
    }

    public  Book getBookById(String id){
        return KNOWN_BOOKS.stream()
                .filter(book -> id.equals(book.getId()))
                .findFirst()
                .orElseThrow();
    }

    public Book getBookByTitle(String title){
        return KNOWN_BOOKS.stream()
                .filter(book -> title.equals(book.getName()))
                .findFirst()
                .orElseThrow();
    }

    public Book getBookByAuthor(String author){
        return KNOWN_BOOKS.stream()
                .filter(book -> author.equals(book.getAuthor()))
                .findFirst()
                .orElseThrow();
    }


    public void deleteBookById(String id) {
        Book book = KNOWN_BOOKS.stream()
                .filter(b -> id.equals(b.getId()))
                .findFirst()
                .orElseThrow();

        KNOWN_BOOKS.remove(book);
    }

}
