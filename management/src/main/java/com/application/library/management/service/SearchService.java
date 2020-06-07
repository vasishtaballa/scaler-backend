package com.application.library.management.service;

import com.application.library.management.bean.Book;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class SearchService {
    public List<Book> getAllBooks() {
        return getBooksFromMemory();
    }

    private List<Book> getBooksFromMemory() {
        List<Book> books = new ArrayList<>();
        books.add(new Book(1, "Rich Dad Poor Dad", "Robert Kiyosaki"));
        books.add(new Book(2, "Faces and Places Professor", "Deepak Nayyar"));
        books.add(new Book(3, "My Country My Life", "L.K. Advani"));
        books.add(new Book(4, "Narendra Modi: A Political Biography", "Andy Marino"));
        books.add(new Book(5, "One Life is Not Enough", "Natwar Singh"));
        return books;
    }
}
