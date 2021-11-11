package com.example.springdatajpa02.repository;

import com.example.springdatajpa02.entity.Library;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LibraryRepository extends JpaRepository<Library, Long> {
}
