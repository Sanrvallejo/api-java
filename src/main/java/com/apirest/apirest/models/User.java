package com.apirest.apirest.models;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
public class User {

  @Id
  @Getter @Setter @Column(name = "id")
  private Long id;

  @Getter @Setter @Column(name = "username")
  private String username;

  @Getter @Setter @Column(name = "lastname")
  private String lastname;

  @Getter @Setter @Column(name = "email")
  private String email;

  @Getter @Setter @Column(name = "phone")
  private String phone;

  @Getter @Setter @Column(name = "password")
  private String password;


}
