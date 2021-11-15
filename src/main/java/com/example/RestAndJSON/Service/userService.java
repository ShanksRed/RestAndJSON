package com.example.RestAndJSON.Service;

import com.example.RestAndJSON.Entity.User;

import java.util.List;

public interface userService {
    List<User> findAll();
    void save(User user);
    List<User> findByName(String name);
}
