package com.example.demo.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.Follow;
import com.example.demo.service.FollowService;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
@RequestMapping("/pixo/follow")
public class FollowController {
	
	@Autowired
	FollowService followService;
	
	@PostMapping("/create")
	public Follow createFollower(@RequestBody Follow follow) {
    	
		return followService.createFollower(follow);
    }

	 @GetMapping("/following/{myid}")
	 public List<Follow> getFollwer(@PathVariable int myid) {	 
		 return followService.getFollowerByMyid(myid);
	 }
	 
	 @GetMapping("/follower/{userid}")
	 public List<Follow> getFollwing(@PathVariable int userid) {	 
		 
		 return followService.getFollowingByUserid(userid);
	 }
	 
}
