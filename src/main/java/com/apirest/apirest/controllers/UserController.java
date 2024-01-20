package com.apirest.apirest.controllers;

import com.apirest.apirest.dao.UserDao;
import com.apirest.apirest.models.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class UserController {

  @Autowired
  private UserDao userDao;

  @RequestMapping("api/users")
  public List<User> getUsers() {
    return userDao.getUsers();
  }

  @RequestMapping(value = "api/register-users", method = RequestMethod.POST)
  public void registerUser(@RequestBody User user) {
    userDao.registerUser(user);
  }

  @RequestMapping(value = "api/delete-user/{id}", method = RequestMethod.DELETE)
  public void deleteUser(@PathVariable Long id) {
    userDao.delete(id);
  }
}
