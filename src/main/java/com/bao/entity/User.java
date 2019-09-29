package com.bao.entity;

import lombok.Data;
import org.springframework.stereotype.Component;

@Component
@Data
public class User {
    private Integer id;
    private String name;
    private String password;
    private Integer status;

}
