package com.javamadman.dao.impl;

import com.javamadman.dao.OrdersDao;
import com.javamadman.entitys.Orders;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:41
 *
 * @author zx
 */
public class OrdersDaoImpl implements OrdersDao {
    @Override
    public int save(Orders orders) throws Exception {
        return 0;
    }

    @Override
    public int dele(Orders orders) {
        return 0;
    }

    @Override
    public int upda(Orders orders) {
        return 0;
    }

    @Override
    public List<Orders> findAll() throws SQLException {
        return null;
    }

    @Override
    public Orders findObjById(Long id) {
        return null;
    }
}
