package com.application.library.management.controller;

import com.application.library.management.bean.Book;
import com.application.library.management.service.SearchService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/search")
public class SearchController {
    private SearchService searchService;

    SearchController(SearchService searchService) {
        this.searchService = searchService;
    }

    @GetMapping("/allBooks")
    public List<Book> getAllBooks() {
        return searchService.getAllBooks();
    }
}
