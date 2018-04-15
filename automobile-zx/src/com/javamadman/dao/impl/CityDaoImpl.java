package com.javamadman.dao.impl;

import com.javamadman.dao.CityDao;
import com.javamadman.entitys.City;
import com.javamadman.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:40
 * 处理城市相关数据访问方法
 * @author zx
 */
public class CityDaoImpl implements CityDao {

    QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

    @Override
    public int save(City city) throws Exception {
        return 0;
    }

    @Override
    public int dele(City city) {
        return 0;
    }

    @Override
    public int upda(City city) {
        return 0;
    }

    @Override
    public List<City> findAll() throws SQLException {
        return null;
    }

    @Override
    public City findObjById(Long id) {
        return null;
    }
}
