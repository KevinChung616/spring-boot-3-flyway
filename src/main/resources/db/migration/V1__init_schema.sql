CREATE TABLE book (
    id BIGINT AUTO_INCREMENT PRIMARY KEY,
    isbn VARCHAR(255) UNIQUE,
    name VARCHAR(255),
    author VARCHAR(255)
);