package com.atguigu.gmall.user.controller;



import com.alibaba.dubbo.config.annotation.Reference;
import com.atguigu.gmall.user.bean.UmsMember;
import com.atguigu.gmall.user.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class UserWebController {
    @Reference
    UserService userService;
    @RequestMapping("/getAllUser1")
    public List<UmsMember> getAllUser()
    {
       return userService.getAllUser();
    }
@RequestMapping("index")
@ResponseBody
public String index(){
    return "hello user";
}
}
