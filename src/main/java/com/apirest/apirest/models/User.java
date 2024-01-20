package com.apirest.apirest.models;

import jakarta.persistence.*;

import lombok.Getter;
import lombok.Setter;

@Entity
@Table(name = "Users")
public class User {

  @Id
  @GeneratedValue(strategy = GenerationType.IDENTITY)
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
