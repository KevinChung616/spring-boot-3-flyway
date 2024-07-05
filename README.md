# Spring Boot 3 - Flyway Integration

This is a demo project of spring boot 3 with Flyway integration.

## Flyway Quick Intro
[Flyway](https://flywaydb.org/) is a database migration tool that helps manage version control for your database schema. It allows you to define and apply incremental changes to your database in a consistent and controlled manner.

## Tech Stack
+ Spring Boot 3
+ Spring Data JPA
+ Maven
+ Flyway
+ Docker
+ MySQL

## How to Setup
Clone this project and run following command:
```shell
mvn clean install
```

Run MySQL in docker
```shell
docker run --name flyway-demo -e MYSQL_ROOT_PASSWORD=root -d --rm -p 3306:3306 mysql:latest
```

> Note: make sure create a `schema` in database GUI, named as `demo2` 

Then, start application, you should see the table `book` is automatically generated by `flyway` based on scripts under `resources/db.migration`. 



## Avoid Error
If you modify the sql scripts after successfully connected to DB, flyway will complain. Internally, it will compare `checksum` of current sql script to `checksum` stored in the db.

