package com.javamadman.service.impl;

import com.javamadman.dao.CityDao;
import com.javamadman.dao.impl.CityDaoImpl;
import com.javamadman.entitys.City;
import com.javamadman.service.CityService;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 9:09
 * 处理城市相关业务逻辑方法
 * @author zx
 */
public class CityServiceImpl implements CityService {

    CityDao cityDao = new CityDaoImpl();

    @Override
    public int save(City city) throws Exception {
        return 0;
    }

    @Override
    public int dele(City city) throws Exception {
        return 0;
    }

    @Override
    public int upda(City city) throws Exception {
        return 0;
    }

    @Override
    public List<City> findAll() throws Exception {
        return null;
    }

    @Override
    public City findObjById(Long id) throws Exception {
        return null;
    }
}
