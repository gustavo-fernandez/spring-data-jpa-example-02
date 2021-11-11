package com.example.springdatajpa02.web;

import com.example.springdatajpa02.entity.Library;
import com.example.springdatajpa02.repository.LibraryRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequiredArgsConstructor
public class LibraryController {

  private final LibraryRepository libraryRepository;

  @GetMapping("/api/library/{id}")
  public Library getLibrary(@PathVariable Long id) {
    return libraryRepository.findById(id).orElseThrow();
  }

}
