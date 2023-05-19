package com.example.RedisConnect.repository;

import com.example.RedisConnect.model.User;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UserDaoImplement implements UserDaoInterface {


    @Autowired
    private RedisTemplate redisTemplate;

    private static final String KEY="USER";



    @Override
    public boolean saveUser(User user) {
        try{

            redisTemplate.opsForHash().put(KEY ,user.getID(),user);
return true;
        }
        catch (Exception e){
            e.printStackTrace();
            return false;

        }
    }

    @Override
    public List<User> fetchAllUser() {
       List<User> Alluser;

Alluser = redisTemplate.opsForHash().values(KEY);
        return Alluser;
    }


    @Override
    public User fetchUserById(int id) {
        return (User) redisTemplate.opsForHash().get(KEY,id);
    }


}
