package com.example.springdatajpa02.config;

import java.util.Optional;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.data.domain.AuditorAware;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@Configuration
@EnableJpaAuditing
public class Config {

  @Bean
  AuditorAware<String> userForAudit() {
    return () -> Optional.of("Usuario logueado");
  }

}
