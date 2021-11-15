package com.example.RestAndJSON.Service;

import com.example.RestAndJSON.Entity.User;
import com.example.RestAndJSON.Repository.userRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class userServiceImpl implements userService{

    @Autowired
    userRepo userRepository;

    @Override
    public List<User> findAll() {
        return userRepository.findAll();
    }

    @Override
    public void save(User user) {

    }

    @Override
    public List<User> findByName(String name) {
        return userRepository.findByName(name);
    }
}
