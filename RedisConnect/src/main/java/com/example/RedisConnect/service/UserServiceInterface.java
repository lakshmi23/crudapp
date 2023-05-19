package com.example.RedisConnect.service;

import com.example.RedisConnect.model.User;

import java.util.List;

public interface UserServiceInterface {
    boolean saveUser(User user);

    List<User> fetchAllUser();

    User fetchUserById(int id);
}
