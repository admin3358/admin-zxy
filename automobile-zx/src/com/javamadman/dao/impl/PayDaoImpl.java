package com.javamadman.dao.impl;

import com.javamadman.dao.PayDao;
import com.javamadman.entitys.Pay;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:42
 *
 * @author zx
 */
public class PayDaoImpl implements PayDao {
    @Override
    public int save(Pay pay) throws Exception {
        return 0;
    }

    @Override
    public int dele(Pay pay) {
        return 0;
    }

    @Override
    public int upda(Pay pay) {
        return 0;
    }

    @Override
    public List<Pay> findAll() throws SQLException {
        return null;
    }

    @Override
    public Pay findObjById(Long id) {
        return null;
    }
}
