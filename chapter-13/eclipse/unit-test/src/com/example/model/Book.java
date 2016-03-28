package com.example.model;

import java.time.LocalDate;

public class Book {
    private String isbn;
    private String title;
    private String author;
    private LocalDate pubDate;
    
    public Book(String isbn, LocalDate pubDate) {
        this.isbn = isbn;
        this.pubDate = pubDate;
    }
    
    public Book(String isbn, String title, String author,
            LocalDate pubDate) {
        this.isbn = isbn;
        this.title = title;
        this.author = author;
        this.pubDate = pubDate;
    }
    
    public String getIsbn() {
        return isbn;
    }
    public void setIsbn(String isbn) {
        this.isbn = isbn;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public LocalDate getPubDate() {
        return pubDate;
    }
    public void setPubDate(LocalDate pubDate) {
        this.pubDate = pubDate;
    }
    
    @Override
    public boolean equals(Object otherBook) {
        return isbn.equals(((Book)otherBook).getIsbn());
    }
}