package com.example.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
public class VideoController {
    @RequestMapping(value = "/mostViewed")
    public String getMostViewed(HttpServletRequest request, HttpServletResponse response) {
        Integer id = (Integer) request.getAttribute("id");
        if (id == null) {
            response.setStatus(500);
        } else if (id == 1) {
            request.setAttribute("viewed", 100);
        } else if (id == 2) {
            request.setAttribute("viewed", 200);
        }
        return "mostViewed";
    }
}