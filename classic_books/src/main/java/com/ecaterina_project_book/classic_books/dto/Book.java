package com.ecaterina_project_book.classic_books.dto;

public class Book {
    private String id;
    private String author;
    private String name;

    private String isbn;

    private String type;

    private Double price;

    private Integer currentStock;

    private boolean available;

    public Book(String id, String author, String name,
                String isbn, String type, Double price, Integer currentStock,
                boolean available) {
        this.id = id;
        this.author = author;
        this.name = name;
        this.isbn = isbn;
        this.type = type;
        this.price = price;
        this.currentStock = currentStock;
        this.available = available;
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

    public String getIsbn() {
        return isbn;
    }

    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }

    public Integer getCurrentStock() {
        return currentStock;
    }

    public void setCurrentStock(Integer currentStock) {
        this.currentStock = currentStock;
    }

    public boolean isAvailable() {
        return available;
    }

    public void setAvailable(boolean available) {
        this.available = available;
    }
}
