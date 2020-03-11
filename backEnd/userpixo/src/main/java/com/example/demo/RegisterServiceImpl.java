package com.example.demo;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class RegisterServiceImpl implements RegisterService {
	@Autowired
	RegisterRepository rr;
	@Autowired
	LoginRepository lr;
	@Override
	public MyUser createUser(MyUser user) {
		
		return rr.save(user);
	}

	@Override
	public Optional<MyUser> findById(Integer id) {
		
		return rr.findById(id);
	}

	@Override
	public List<MyUser> getAllUsers() {
		
		return (List<MyUser>) rr.findAll();
	}

	@Override
	public MyUser findByName(String username) {
		
		return rr.findByUsername(username);
	}

	@Override
	public MyLogin createLogin(MyLogin login) {
		
		return lr.save(login);
	}

	@Override
	public MyLogin getByUsername(String username) {
		
		return lr.getByUsername(username);
	}

}
