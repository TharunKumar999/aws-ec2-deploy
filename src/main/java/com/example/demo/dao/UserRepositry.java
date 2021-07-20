package com.example.demo.dao;

import com.example.demo.model.UserEntity;
import org.springframework.data.mongodb.repository.MongoRepository;
import org.springframework.stereotype.Repository;


public interface UserRepositry extends MongoRepository<UserEntity,String> {
}