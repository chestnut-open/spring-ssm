package com.bao.mapper;

import com.bao.entity.User;
import org.apache.ibatis.annotations.Param;
import org.omg.CORBA.INTERNAL;

import java.util.List;

public interface IUserMapper {
/*添加*/
    Integer addUser(@Param("use") User user);

//删
Integer deleteById(@Param("id") int id);
//改
Integer updateUser(@Param("use1") User user);
//查
List<User> querryAll();




 }