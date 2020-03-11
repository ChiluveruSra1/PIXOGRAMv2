package com.example.demo;

import java.util.Random;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

import lombok.Data;

@Entity
@Data
public class MyUser {
@Id
private int id;
private String fname;
private String lname;
private String username;
private String password;
private String email;
private String profilepic;
public MyUser( ) {
	super();
	Random rand = new Random();
	int resRandom = rand.nextInt((9999 - 100) + 1) + 10;
	this.id = resRandom;
}

}
