package com.example.springdatajpa02.entity;

import javax.persistence.Column;
import javax.persistence.MappedSuperclass;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
@MappedSuperclass
public class EmployeeCommon {

  @Column(name = "emp_code")
  private String employeeCode;

}
