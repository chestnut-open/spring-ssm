package com.bao.controller;


import com.bao.entity.User;
import com.bao.service.impl.UserServiceImpl;
import lombok.extern.slf4j.Slf4j;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;
import java.util.List;

@RequestMapping(value = "/home")
@RestController
@Slf4j
public class UserController {
   @Resource
  private UserServiceImpl userService;


   @RequestMapping(value = "/add",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public String add(){
       User user = new User();

       user.setName("icac");
       user.setPassword("123456");
       Integer row = userService.addUser(user);
       log.info("影响行数:"+row);
       System.out.println("id:"+user.getId());

       Integer deleteRow = userService.delete(3);
       System.out.println("删除" + deleteRow);

       User user1 = new User();
       user1.setId(6);
       user1.setName("xs");
       user1.setPassword("xs123");
       Integer updateRow = userService.updateById(user1);

       log.debug("修改"+updateRow);
       List<User> users = userService.querryAll();

       log.debug("数据"+users);
       return "添加成功!";
   }
}
