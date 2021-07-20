package com.example.demo.service;

import com.example.demo.dao.UserRepositry;
import com.example.demo.model.UserEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class UserServiceImpl implements UserService{

    private UserRepositry userRepository;


    @Autowired
    public UserServiceImpl(UserRepositry userRepository) {
        this.userRepository = userRepository;
    }

    @Override
    public UserEntity createUser(UserEntity userEntity) {
        return userRepository.save(userEntity);
    }

    @Override
    public List<UserEntity> displayCustomer() {
        return userRepository.findAll();
    }
}