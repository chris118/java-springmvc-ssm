package com.hhit.springmvc.mapper;


import com.hhit.springmvc.model.User;

public interface UserMapper {
    public User getUser(Long id);

    public int insertUser(User user);

    public int deleteUser(Long id);
}