package com.hhit.springmvc.service;

import com.hhit.springmvc.model.User;

import java.util.List;

public interface UserService {
    List<User> getAllUsers();

    User findUserById(Long id);

    void insertUser(User user);

    boolean deleteUserById(Long id);

    boolean updateUser(User user);
}
