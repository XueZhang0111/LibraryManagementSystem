package edu.iit.cs425.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

/**
 * @description: Handling requests from search documents
 * @author: Xue Zhang
 * @date: 2021-12-04
 * @version: 1.0
 **/
@Controller
public class SearchServlet {
    @RequestMapping("/searchDoc")
    public String searchDoc() {
        return "searchList";
    }
}
