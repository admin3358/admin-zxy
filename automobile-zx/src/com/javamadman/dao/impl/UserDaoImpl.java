package com.javamadman.dao.impl;

import com.javamadman.dao.UserDao;
import com.javamadman.entitys.User;
import com.javamadman.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:43
 * 处理用户相关数据访问方法
 * @author zx
 */
public class UserDaoImpl implements UserDao {

    QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

    @Override
    public int save(User user) throws Exception {
        String sql = "insert into user(u_password,phone,check_Code,verify_Code) values(?,?,?,?)";
        Object[] param ={user.getuPassword(),user.getPhone(),user.getCheckCode(),user.getVerifyCode()};
        return runner.update(sql, param);
    }

    @Override
    public int dele(User user) throws SQLException {
        String sql = "delete from user where id=?";
        return runner.update(sql, user.getId());
    }

    @Override
    public int upda(User user) throws SQLException {
        String sql = "update user set u_name=?,u_password=?,phone=? where id=? ";
        Object[] param ={user.getuName(),user.getuPassword(),user.getPhone(),user.getId()};
        return runner.update(sql,param);
    }

    @Override
    public List<User> findAll() throws SQLException {
        return null;
    }

    @Override
    public User findObjById(Long id) {
        return null;
    }

    @Override
    public User findUserByPhone(String phone) throws SQLException {
        String sql = "select id from user where phone=?";
        return runner.query(sql,new BeanHandler<User>(User.class),phone);
    }
}
