package com.example.RedisConnect.repository;

import com.example.RedisConnect.model.User;

import java.util.List;

public interface UserDaoInterface {
    boolean saveUser(User user);

    List<User> fetchAllUser();



    User fetchUserById(int id);
}
