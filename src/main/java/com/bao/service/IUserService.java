package com.bao.service;

import com.bao.entity.User;

import java.util.List;

public interface IUserService {
    Integer addUser(User user);
    Integer delete(int id);
    Integer updateById(User user);
    List<User> querryAll();
}
