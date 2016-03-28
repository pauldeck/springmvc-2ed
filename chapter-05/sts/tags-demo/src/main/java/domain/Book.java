package domain;

import java.io.Serializable;
import java.math.BigDecimal;

public class Book implements Serializable {
    
    private static final long serialVersionUID = 1520961851058396786L;
    private long id;
    private String isbn;
    private String title;
    private Category category;
    private String author;
    private BigDecimal price;
    
    public Book() {
    }
    
    public Book(long id, String isbn, String title, 
            Category category, String author, BigDecimal price) {
        this.id = id;
        this.isbn = isbn;
        this.title = title;
        this.category = category;
        this.author = author;
        this.price = price;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
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
    public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
    public String getAuthor() {
        return author;
    }
    public void setAuthor(String author) {
        this.author = author;
    }
    public BigDecimal getPrice() {
        return price;
    }
    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}
