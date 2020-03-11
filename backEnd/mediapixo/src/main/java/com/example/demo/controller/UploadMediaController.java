package com.example.demo.controller;

import java.io.IOException;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.UploadMedia;
import com.example.demo.service.UploadMediaService;


@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class UploadMediaController {

	@Autowired
	UploadMediaService uploadMediaService;
	
	@PostMapping("/media/create/{userId}")
	public UploadMedia createMedia(@RequestBody UploadMedia media,@PathVariable int userId) throws IOException {
    
		UploadMedia uploadMedia=new UploadMedia(userId, media.getTitle(), media.getDescription(), media.getTags(), media.getUrl());
		uploadMediaService.createMedia(uploadMedia);
		return uploadMedia;
    }

	 @GetMapping("/media/id/{userId}")
	 public List<UploadMedia> getUserMedia(@PathVariable int userId) throws IOException {	 
		 return uploadMediaService.getMediaByUid(userId);
	 }
 
	
}
