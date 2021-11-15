package com.example.RestAndJSON.RestController;


import com.example.RestAndJSON.Entity.User;
import com.example.RestAndJSON.Service.userServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class userController {
    @Autowired
    userServiceImpl userService;

    @GetMapping(value = "/allUsers",produces = MediaType.APPLICATION_JSON_VALUE)
    List<User> getAllUsers(){
        return userService.findAll();
    }

    @GetMapping(value = "/User",produces = MediaType.APPLICATION_JSON_VALUE)
    List<User> getUsersByName(@RequestParam(value = "name") String name ){
        return userService.findByName(name);
    }
}
