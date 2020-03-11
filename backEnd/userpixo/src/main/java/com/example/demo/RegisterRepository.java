package com.example.demo;

import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;
@Repository
public interface RegisterRepository extends CrudRepository<MyUser, Integer>{
public MyUser findByUsername(String Username);
}
