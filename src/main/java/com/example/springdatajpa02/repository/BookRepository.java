package com.example.springdatajpa02.repository;

import com.example.springdatajpa02.entity.Book;
import org.springframework.data.jpa.repository.JpaRepository;

public interface BookRepository extends JpaRepository<Book, Long> {

}
