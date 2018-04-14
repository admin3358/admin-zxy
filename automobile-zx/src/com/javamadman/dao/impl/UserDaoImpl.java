package com.javamadman.dao.impl;

import com.javamadman.dao.UserDao;
import com.javamadman.entitys.User;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:43
 *
 * @author zx
 */
public class UserDaoImpl implements UserDao {
    @Override
    public int save(User user) throws Exception {
        return 0;
    }

    @Override
    public int dele(User user) {
        return 0;
    }

    @Override
    public int upda(User user) {
        return 0;
    }

    @Override
    public List<User> findAll() throws SQLException {
        return null;
    }

    @Override
    public User findObjById(Long id) {
        return null;
    }
}
