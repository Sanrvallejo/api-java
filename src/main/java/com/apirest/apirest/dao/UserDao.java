package com.apirest.apirest.dao;

import com.apirest.apirest.models.User;
import java.util.List;

public interface UserDao {

  List<User> getUsers();

  void delete(Long id);

  void registerUser(User user);
}
