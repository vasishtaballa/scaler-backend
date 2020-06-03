package com.application.spring.library.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;

import com.application.spring.library.bean.Book;
import com.application.spring.library.service.SearchService;

@RestController
public class SearchController {
	@Autowired
	SearchService searchSvc;

	public List<Book> getAllBooks() {
		return searchSvc.getAllBooks();
	}
}
