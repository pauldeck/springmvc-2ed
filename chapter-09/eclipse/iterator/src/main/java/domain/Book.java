package domain;

import java.math.BigDecimal;

public class Book {

    private String isbn;
    private String title;
    private BigDecimal price;
    
    public Book(String isbn, String title, BigDecimal price) {
        this.isbn = isbn;
        this.title = title;
        this.price = price;
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

    public BigDecimal getPrice() {
        return price;
    }

    public void setPrice(BigDecimal price) {
        this.price = price;
    }
}