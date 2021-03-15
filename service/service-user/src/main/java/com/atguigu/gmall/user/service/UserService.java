package com.atguigu.gmall.user.service;

import com.atguigu.gmall.model.user.UserInfo;


public interface UserService {

    //  select * from user_info where username = ? and password = ?
    UserInfo login(UserInfo userInfo);
}
