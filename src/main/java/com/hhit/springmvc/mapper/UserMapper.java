package com.hhit.springmvc.mapper;


import com.hhit.springmvc.model.User;

import java.util.List;

public interface UserMapper {
    List<User> getAllUsers();

    User getUser(Long id);

    int insertUser(User user);

    int deleteUser(Long id);

    int updateUser(User user);
}