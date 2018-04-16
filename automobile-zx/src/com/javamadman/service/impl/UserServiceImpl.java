package com.javamadman.service.impl;

import com.javamadman.dao.UserDao;
import com.javamadman.dao.impl.UserDaoImpl;
import com.javamadman.entitys.User;
import com.javamadman.service.UserService;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 9:13
 * 处理用户相关业务逻辑方法
 * @author zx
 */
public class UserServiceImpl implements UserService {

    UserDao userDao = new UserDaoImpl();

    @Override
    public int save(User user) throws Exception {
        UserDao userDao = new UserDaoImpl();
        User userByPhone = userDao.findUserByPhone(user.getPhone());
        int row = -1;
        if(userByPhone != null){
            //return row;
            throw new RuntimeException("用户名已经存在");
        }
        row = userDao.save(user);

        return row;
    }

    @Override
    public int dele(User user) throws Exception {
        return 0;
    }

    @Override
    public int upda(User user) throws Exception {
        return 0;
    }

    @Override
    public List<User> findAll() throws Exception {
        return null;
    }

    @Override
    public User findObjById(Long id) throws Exception {
        return null;
    }

    @Override
    public User findUserByPhone(String phone) throws SQLException {
        UserDao userDao = new UserDaoImpl();
        User userByPhone = userDao.findUserByPhone(phone);
        if(userByPhone == null){
            throw new RuntimeException("用户不存在");
        }
        return userByPhone;
    }
}
