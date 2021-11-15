package com.example.RestAndJSON.Repository;

import com.example.RestAndJSON.Entity.User;

import java.util.List;

public interface crudRepo<T> {
    void save(T unit);
    List<T> findAll();
    void deleteByName(String name);
    List<T> findByName(String name);
}
