package com.jtsp.springboot3flyway.repository;

import com.jtsp.springboot3flyway.model.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {
}
