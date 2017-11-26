package com.didispace.service;

import com.didispace.domain.User;
import com.didispace.mapper.UserMapper;
import com.didispace.mapper.XUserMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * Created by Yuanping on 2017/11/26.
 */
@Service
public class UserService {
    @Autowired
    private XUserMapper xUserMapper;

    @Autowired
    private UserMapper userMapper;

    public User getXUserById(Integer id) {
        return  xUserMapper.findById(id);
    }

    /**
     * 根据id 获取用户信息
     * @param id
     * @return
     */
    public User getUserById(Integer id){
        return  userMapper.findById(id);
    }

    /**
     * 添加用户
     * @param user
     * @return
     */
    public int add(User user) {
        return userMapper.insert(user.getName(),user.getAge());
    }

    /**
     * 修改用户信息
     * @param user
     * @return
     */
    public int update(User user) {
        return userMapper.update(user);
    }

    /**
     * 删除用户信息
     * @param id
     * @return
     */
    public int delete(Integer id) {
        return userMapper.delete(id);
    }

}









