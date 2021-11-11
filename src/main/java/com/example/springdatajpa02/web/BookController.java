package com.example.springdatajpa02.web;

import com.example.springdatajpa02.entity.Book;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class BookController {

  private final EntityManager entityManager;

  @GetMapping("/api/book/{id}")
  public Book getBook(@PathVariable Long id) {
    return entityManager.find(Book.class, id);
  }

}
