package com.apirest.apirest.dao;

import com.apirest.apirest.models.User;
import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Repository
@Transactional
public class UserDaoImpl implements UserDao {
  @PersistenceContext
  EntityManager entityManager;

  @Override
  public List<User> getUsers() {
    String query = "FROM User";
    return entityManager.createQuery(query).getResultList();
  }

  @Override
  public void delete(Long id) {
    User userFound = entityManager.find(User.class, id);
    entityManager.remove(userFound);
  }

  @Override
  public void registerUser(User user) {
    entityManager.merge(user);
  }


}
