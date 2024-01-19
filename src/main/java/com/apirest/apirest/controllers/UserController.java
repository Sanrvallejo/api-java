package com.apirest.apirest.controllers;

import com.apirest.apirest.dao.UserDao;
import com.apirest.apirest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UserDao userDao;

  @RequestMapping("api/users")
  public List<User> getUsers() {
    return userDao.getUsers();
  }

  @RequestMapping(value = "api/delete-user/{id}", method = RequestMethod.DELETE)
  public void deleteUser(@PathVariable Long id) {
    userDao.delete(id);
  }
}
