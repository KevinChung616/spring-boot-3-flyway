package com.jtsp.springboot3flyway.service;

import com.jtsp.springboot3flyway.model.entity.Book;
import com.jtsp.springboot3flyway.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BookService {

    private BookRepository repository;

    @Autowired
    public BookService(BookRepository repository) {
        this.repository = repository;
    }

    public List<Book> getAllBooks() {
        return repository.findAll();
    }
}
