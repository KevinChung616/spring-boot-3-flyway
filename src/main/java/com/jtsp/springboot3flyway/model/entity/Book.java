package com.jtsp.springboot3flyway.model.entity;

import jakarta.persistence.*;
import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@ToString
@Builder
@Entity
@Table
public class Book {
    @Id
    @GeneratedValue
    private Long id;

    @Column(unique = true)
    private String isbn;

    @Column
    private String name;

    @Column
    private String author;

}
