package com.jtsp.springboot3flyway.mapper;

import com.jtsp.springboot3flyway.model.dto.BookDTO;
import com.jtsp.springboot3flyway.model.entity.Book;
import org.springframework.stereotype.Component;

@Component
public class BookMapper {

    public Book toBook(BookDTO bookDTO) {
        return Book.builder()
                .name(bookDTO.getName())
                .isbn(bookDTO.getIsbn())
                .author(bookDTO.getAuthor())
                .build();
    }

    public BookDTO toBookDTO(Book book) {
        return BookDTO.builder()
                .author(book.getAuthor())
                .name(book.getName())
                .isbn(book.getIsbn())
                .build();
    }
}
