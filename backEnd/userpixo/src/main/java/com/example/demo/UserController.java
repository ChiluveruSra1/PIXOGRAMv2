package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@CrossOrigin(origins = "http://localhost:4200")
@RestController

public class UserController {
@Autowired
RegisterService rs;
@PostMapping("/user/create")
public MyUser createUser(@RequestBody MyUser user)
{
	MyLogin login = new MyLogin(user.getId(), user.getUsername(), user.getPassword(), user.getProfilepic());
	rs.createLogin(login);
	return rs.createUser(user);
}
@GetMapping("/user/{name}") 
public MyUser getUserByName(@PathVariable(value = "name") String name)
{
	return rs.findByName(name);
}

@GetMapping("/user/login/{name}") 
public MyLogin getLoginByName(@PathVariable(value = "name") String name)
{
	return rs.getByUsername(name);
}

}
