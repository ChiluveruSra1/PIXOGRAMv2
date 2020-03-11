package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface LoginRepository extends CrudRepository<MyLogin, Integer> {
public MyLogin getByUsername(String username);
public MyLogin findByUsernameAndPassword(String username,String password);
}
