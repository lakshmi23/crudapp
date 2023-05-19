package com.example.RedisConnect.service;

import com.example.RedisConnect.model.User;
import com.example.RedisConnect.repository.UserDaoInterface;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class UserService implements UserServiceInterface {

    @Autowired
    private UserDaoInterface userdao;


    @Override

    public boolean saveUser(User user) {
        return userdao.saveUser(user);
    }

    @Override
    public List<User> fetchAllUser() {


        return userdao.fetchAllUser();
    }

    @Override
    public User fetchUserById(int id) {
        return  userdao.fetchUserById(id);

    }
}
