package com.javamadman.dao.impl;

import com.javamadman.dao.AreaDao;
import com.javamadman.entitys.Area;
import com.javamadman.utils.DataSourceUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanListHandler;

import java.sql.SQLException;
import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:39
 *
 * @author zx
 */
public class AreaDaoImpl implements AreaDao {


    QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

    @Override
    public int save(Area area) throws Exception {
        String sql = "inset into area(a_name,city_id) values(?,?)";
        return runner.update(sql,area.getaName(),area.getCity().getId());
    }

    @Override
    public int dele(Area area) {
        return 0;
    }

    @Override
    public int upda(Area area) {
        return 0;
    }

    @Override
    public List<Area> findAll() throws SQLException {
        String sql = "select id,a_name aName from area";
        return runner.query(sql,new BeanListHandler<Area>(Area.class));
    }

    @Override
    public Area findObjById(Long id) {
        return null;
    }
}
