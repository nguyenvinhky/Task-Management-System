package com.cyan.usertaskservice.service;

import com.cyan.usertaskservice.model.User;

import java.util.List;

public interface UserService {

    public User getUserProfile(String jwt);

    public List<User> getAllUsers();
}
