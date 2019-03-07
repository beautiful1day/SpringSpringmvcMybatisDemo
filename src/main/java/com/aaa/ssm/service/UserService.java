package com.aaa.ssm.service;

import com.aaa.ssm.util.JedisUtil;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;
import java.util.Map;

/**
 * fileName:UserService
 * description:
 * author:zz
 * createTime:2019/03/03 11:44
 */
public interface UserService {
    List<Map> get();
}
