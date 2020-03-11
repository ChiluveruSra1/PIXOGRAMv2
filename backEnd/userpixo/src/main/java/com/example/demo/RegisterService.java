package com.example.demo;

import java.util.List;
import java.util.Optional;

public interface RegisterService {
public MyUser createUser(MyUser user);
public Optional<MyUser> findById(Integer id);
public List<MyUser> getAllUsers();
public MyUser findByName(String username);
public MyLogin createLogin(MyLogin login);
public MyLogin getByUsername(String username);
}
