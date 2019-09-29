package com.bao.service.impl;

import com.bao.entity.User;
import com.bao.mapper.IUserMapper;
import com.bao.service.IUserService;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;
import java.util.List;

@Service
public class UserServiceImpl implements IUserService {
    @Resource
    IUserMapper iUserMapper;


    @Override
    public Integer addUser(User user) {
        Integer AddRow = iUserMapper.addUser(user);
        return AddRow;
    }

    @Override
    public Integer delete(int id) {
        Integer DelRow = iUserMapper.deleteById(id);
        return DelRow;
    }

    @Override
    public Integer updateById(User user) {
        Integer UpDateRow = iUserMapper.updateUser(user);
        return UpDateRow;
    }

    @Override
    public List<User> querryAll() {
        List<User> users = iUserMapper.querryAll();
        return users;
    }
}
