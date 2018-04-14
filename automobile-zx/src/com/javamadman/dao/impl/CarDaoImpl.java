package com.javamadman.dao.impl;

import com.javamadman.dao.CarDao;
import com.javamadman.entitys.Car;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:40
 *
 * @author zx
 */
public class CarDaoImpl implements CarDao {
    @Override
    public int save(Car car) throws Exception {
        return 0;
    }

    @Override
    public int dele(Car car) {
        return 0;
    }

    @Override
    public int upda(Car car) {
        return 0;
    }

    @Override
    public List<Car> findAll() throws SQLException {
        return null;
    }

    @Override
    public Car findObjById(Long id) {
        return null;
    }
}
