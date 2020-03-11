package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.Follow;
import com.example.demo.repository.FollowRepository;

@Service
public class FollowServiceImpl implements FollowService {
	
	@Autowired
	FollowRepository fr;

	@Override
	public Follow createFollower(Follow follow) {
		return fr.save(follow);
	}

	@Override
	public List<Follow> getFollowerByMyid(int myid) {
		return fr.getByMyid(myid);
	}

	@Override
	public List<Follow> getFollowingByUserid(int userid) {
		return fr.getByUserid(userid);
	}

}
