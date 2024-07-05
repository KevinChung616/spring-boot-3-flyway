package com.jtsp.springboot3flyway;

import com.jtsp.springboot3flyway.model.entity.Book;
import com.jtsp.springboot3flyway.repository.BookRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class SpringBoot3FlywayApplication implements CommandLineRunner {
    @Autowired
    private BookRepository repository;

    public static void main(String[] args) {
        SpringApplication.run(SpringBoot3FlywayApplication.class, args);
    }

    @Override
    public void run(String... args) throws Exception {
        repository.findAll().forEach(System.out::println);
    }
}
