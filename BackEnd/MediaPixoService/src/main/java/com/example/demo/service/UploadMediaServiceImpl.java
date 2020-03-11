package com.example.demo.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.example.demo.entity.UploadMedia;
import com.example.demo.repository.UploadMediaRepository;

@Service
public class UploadMediaServiceImpl implements UploadMediaService {

	@Autowired
	UploadMediaService uploadMediaService;
	
	@Autowired
	UploadMediaRepository uploadMediaRepository;

	@Override
	public UploadMedia createMedia(UploadMedia uploadMedia) {
		return uploadMediaRepository.save(uploadMedia);		
	}

	@Override
	public List<UploadMedia> getMediaByUid(int userId) {
		return uploadMediaRepository.getByUid(userId);
	}
}
