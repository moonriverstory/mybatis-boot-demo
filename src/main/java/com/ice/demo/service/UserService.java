package com.ice.demo.service;

import com.ice.demo.dao.UserMapper;
import com.ice.demo.entity.User;
import com.ice.demo.entity.UserExample;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;


@Service
public class UserService {

    @Autowired
    private UserMapper userMapper;

    public String show() {
        return "Hello World!";
    }

    public List<User> showDao(int age) {
        UserExample example = new UserExample();
        UserExample.Criteria criteria = example.createCriteria();
        criteria.andAgeEqualTo(age);
        return userMapper.selectByExample(example);
    }

    public String insert(String name, int age) {
        User user = new User();
        user.setName(name);
        user.setAge(age);
        userMapper.insert(user);
        return "Insert ( \"" + name + "\", age" + age + ") OK!";
    }


}
