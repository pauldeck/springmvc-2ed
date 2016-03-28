package com.example.controller;

import java.time.LocalDate;
import java.util.Arrays;
import java.util.List;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.model.Book;

@Controller
public class BookController {
    @RequestMapping(value = "/latest/{pubYear}")
    public ModelAndView getLatestTitles(
            @PathVariable String pubYear) {
        ModelAndView mav = new ModelAndView("Latest Titles");
        
        if ("2016".equals(pubYear)) {
            List<Book> list = Arrays.asList(
                    new Book("0001", "Spring MVC: A Tutorial", 
                            "Paul Deck", 
                            LocalDate.of(2016, 6, 1)),
                    new Book("0002", "Java Tutorial",
                            "Budi Kurniawan", 
                            LocalDate.of(2016, 11, 1)),
                    new Book("0003", "SQL", "Will Biteman", 
                            LocalDate.of(2016, 12, 12)));
            mav.getModel().put("latest", list);
        }
        return mav;
    }
}