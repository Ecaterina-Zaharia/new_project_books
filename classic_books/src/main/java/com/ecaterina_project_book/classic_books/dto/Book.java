package com.ecaterina_project_book.classic_books.dto;

public class Book {
    private String id;
    private String author;
    private String name;
    private Integer price;

    public Book(String id, String author, String name, Integer price) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.price = price;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getPrice() {
        return price;
    }

    public void setPrice(Integer price) {
        this.price = price;
    }
}
