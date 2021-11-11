package com.example.springdatajpa02.entity;

import javax.persistence.AttributeOverride;
import javax.persistence.Column;
import javax.persistence.Embedded;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Getter
@Setter
public class Author extends EmployeeCommon{

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
  private Long id;

  @Column(name = "full_name", length = 50)
  private String name;

  @Embedded
  @AttributeOverride(name = "description", column = @Column(name = "address_desc"))
  @AttributeOverride(name = "reference", column = @Column(name = "address_ref"))
  private Address address;

}
