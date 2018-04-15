package com.javamadman.service.impl;

import com.javamadman.dao.CarDao;
import com.javamadman.dao.impl.CarDaoImpl;
import com.javamadman.entitys.Car;
import com.javamadman.service.CarService;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 9:08
 * 处理汽车相关业务逻辑方法
 * @author zx
 */
public class CarServiceImpl implements CarService {

    CarDao carDao = new CarDaoImpl();

    @Override
    public int save(Car car) throws Exception {
        return 0;
    }

    @Override
    public int dele(Car car) throws Exception {
        return 0;
    }

    @Override
    public int upda(Car car) throws Exception {
        return 0;
    }

    @Override
    public List<Car> findAll() throws Exception {
        return null;
    }

    @Override
    public Car findObjById(Long id) throws Exception {
        return null;
    }
}
