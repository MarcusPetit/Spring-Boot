package com.marcus.springboot.repossitory;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.marcus.springboot.model.User;

public interface UserRepository extends JpaRepository<User, Long> {

  @Query("SELECT u from User u where u.id > :id")
  public List<User> findAllMoreThan(@Param("id") Long id);

  public List<User> findByIdGreaterThan(Long id);

  public List<User> findByNameIgnoreCase(String name);

}