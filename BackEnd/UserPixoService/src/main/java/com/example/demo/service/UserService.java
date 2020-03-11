package com.example.demo.service;

import com.example.demo.entity.Login;
import com.example.demo.entity.User;

public interface UserService {

	Login createLogin(Login login);

	User createUser(User user);

	User findByName(String name);

	Login getByUsername(String name);

}
