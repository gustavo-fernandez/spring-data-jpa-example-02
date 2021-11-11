package com.example.springdatajpa02;

import com.example.springdatajpa02.entity.Address;
import com.example.springdatajpa02.entity.Author;
import com.example.springdatajpa02.entity.Book;
import com.example.springdatajpa02.entity.Library;
import java.util.List;
import java.util.UUID;
import javax.persistence.EntityManager;
import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.transaction.support.TransactionTemplate;

@SpringBootApplication
@Slf4j
public class SpringDataJpa02Application {

  public static void main(String[] args) {
    SpringApplication.run(SpringDataJpa02Application.class, args);
  }

  @Bean
  CommandLineRunner commandLineRunner(
    EntityManager entityManager, TransactionTemplate transactionTemplate) {
    return args -> {
      transactionTemplate.execute(status -> {
        log.info("Ejecutandose..." + entityManager);

        var address = new Address("Z", "DESC", "REF");
        var arturito = new Author(null, "Arturito Rios", address);
        arturito.setEmployeeCode(UUID.randomUUID().toString());

        var library = new Library();
        var book1 = new Book(null, "123", library, arturito);
        var book2 = new Book(null, "ABC", library, arturito);
        var books = List.of(
          book1, book2
        );
        library.setName("My Library");
        library.setBooks(books);

        entityManager.persist(library);

        return null;
      });
    };
  }

}
