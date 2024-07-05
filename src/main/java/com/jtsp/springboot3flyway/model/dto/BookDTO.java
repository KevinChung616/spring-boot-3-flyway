package com.jtsp.springboot3flyway.model.dto;

import lombok.*;

@AllArgsConstructor
@NoArgsConstructor
@Data
@Builder
@ToString
public class BookDTO {

    private String isbn;

    private String name;

    private String author;
}
