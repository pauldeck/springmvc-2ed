package com.example.controller;

import static org.springframework.test.web.ModelAndViewAssert.*;
import java.time.LocalDate;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import org.junit.Test;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Book;

public class BookControllerTest {
    @Test
    public void test() {
        BookController bookController = new BookController();
        ModelAndView mav = bookController
                .getLatestTitles("2016");
        assertViewName(mav, "Latest Titles");
        assertModelAttributeAvailable(mav, "latest");
        List<Book> expectedList = Arrays.asList(
                new Book("0002", LocalDate.of(2016, 11, 1)),
                new Book("0001", LocalDate.of(2016, 6, 1)),
                new Book("0003", LocalDate.of(2016, 12, 12)));
        assertAndReturnModelAttributeOfType(mav, "latest", 
                expectedList.getClass());
        Comparator<Book> pubDateComparator = 
                (a, b) -> a.getPubDate()
                .compareTo(b.getPubDate());
        assertSortAndCompareListModelAttribute(mav, "latest", 
                expectedList, pubDateComparator);
    }
}