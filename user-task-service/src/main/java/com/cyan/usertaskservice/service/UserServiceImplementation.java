package com.cyan.usertaskservice.service;

import com.cyan.usertaskservice.config.JwtProvider;
import com.cyan.usertaskservice.model.User;
import com.cyan.usertaskservice.repository.UserRepository;

import java.util.List;

public class UserServiceImplementation implements UserService{

    private UserRepository userRepository;

    @Override
    public User getUserProfile(String jwt){
        String email = JwtProvider.getEmailFromJwtToken(jwt);
        return userRepository.findByEmail(email);
    }

    @Override
    public List<User> getAllUsers(){
        return userRepository.findAll();
    }
}
