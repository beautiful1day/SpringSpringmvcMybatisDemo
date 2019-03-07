package com.aaa.ssm.service;

import com.aaa.ssm.dao.UserDao;
import com.aaa.ssm.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;
@Service
public class UserServices implements UserService{
    @Autowired
    private UserDao userDao;
    @Autowired
    private JedisUtil jedisUtil;

    @Override
    public List<Map> get() {
        //从redis  取 对象
        Object userList = jedisUtil.getObject("userList");
        if(userList!=null){//如果存在，直接返回
            System.out.println("从red`is缓存中取！！！！！");
            return (List<Map>)userList;
        }else{//不存在 ，从数据库中获取，放入缓存
            System.out.println("从数据库取。。。。。。。。。");
            System.out.println("从数。。。。。。。。。");
            System.out.println("从数据库。。。。。。。。。");
            List<Map> userList1 = userDao.get();
            jedisUtil.putObject("userList",userList1);
            return userList1;
        }

    }
}
