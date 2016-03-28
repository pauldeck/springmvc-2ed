package service;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import domain.Book;
import domain.Category;

@Service
public class BookServiceImpl implements BookService {
    
    /*
     * this implementation is not thread-safe
     */
    private List<Category> categories;
    private List<Book> books;
    
    public BookServiceImpl() {
        categories = new ArrayList<Category>();
        Category category1 = new Category(1, "Computer");
        Category category2 = new Category(2, "Travel");
        Category category3 = new Category(3, "Health");
        categories.add(category1);
        categories.add(category2);
        categories.add(category3);
        
        books = new ArrayList<Book>();
        books.add(new Book(1L, "9781771970273",
                "Servlet & JSP: A Tutorial (2nd Edition)", 
                category1, "Budi Kurniawan", new BigDecimal("54.99")));
        books.add(new Book(2L, "9781771970297",
                "C#: A Beginner's Tutorial (2nd Edition)",
                category1, "Jayden Ky", new BigDecimal("39.99")));
    }

    @Override
    public List<Category> getAllCategories() {
        return categories;
    }
    
    @Override
    public Category getCategory(int id) {
        for (Category category : categories) {
            if (id == category.getId()) {
                return category;
            }
        }
        return null;
    }

    @Override
    public List<Book> getAllBooks() {
        return books;
    }

    @Override
    public Book save(Book book) {
        book.setId(getNextId());
        books.add(book);
        return book;
    }

    @Override
    public Book get(long id) {
        for (Book book : books) {
            if (id == book.getId()) {
                return book;
            }
        }
        return null;
    }
    
    @Override
    public Book update(Book book) {
        int bookCount = books.size();
        for (int i = 0; i < bookCount; i++) {
            Book savedBook = books.get(i);
            if (savedBook.getId() == book.getId()) {
                books.set(i, book);
                return book;
            }
        }
        return book;
    }
    
    @Override
    public long getNextId() {
        // needs to be locked
        long id = 0L;
        for (Book book : books) {
            long bookId = book.getId();
            if (bookId > id) {
                id = bookId;
            }
        }
        return id + 1;
    }
}
