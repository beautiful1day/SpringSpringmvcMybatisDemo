package com.aaa.ssm.controller;
import com.aaa.ssm.service.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;
import java.util.Map;


@Controller
public class UserAction {
    //7
    @Autowired
    private UserService ser;
    @RequestMapping("get")
    @ResponseBody
    public List<Map> get(){
        return ser.get();
    }
}
