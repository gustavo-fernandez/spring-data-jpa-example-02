package com.example.springdatajpa02.web;

import com.example.springdatajpa02.entity.Library;
import javax.persistence.EntityManager;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LibraryController {

  private final EntityManager entityManager;

  @GetMapping("/api/library/{id}")
  public Library getLibrary(@PathVariable Long id) {
    return entityManager.find(Library.class, id);
  }

}
