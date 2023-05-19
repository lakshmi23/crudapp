package com.example.RedisConnect.controller;

import com.example.RedisConnect.model.User;
import com.example.RedisConnect.service.UserServiceInterface;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class MyController {
    Logger logger = LoggerFactory.getLogger(MyController.class);

    @Autowired
    private UserServiceInterface userService;


    @PostMapping("/user")

    public ResponseEntity<String> saveUser(@RequestBody User user) {
        boolean result = userService.saveUser(user);
        if (result) {
            logger.info("user was created ");
            return ResponseEntity.ok("user created succesfully");

        } else {
            logger.error("Error");
            return ResponseEntity.status(HttpStatus.BAD_REQUEST).build();
        }
    }

    @GetMapping("/fetch")
    public ResponseEntity<List<User>> featchAllUser() {
        List<User> allUsers;
        allUsers = userService.fetchAllUser();
        logger.info("all users printed successful ");
        return ResponseEntity.ok(allUsers);
    }

    @GetMapping("/fetchById")
    public User GetUserByid(@RequestParam int id){
        return userService.fetchUserById(id);
    }
}
