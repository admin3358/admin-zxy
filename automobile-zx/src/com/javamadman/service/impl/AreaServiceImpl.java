package com.javamadman.service.impl;

import com.javamadman.dao.AreaDao;
import com.javamadman.dao.impl.AreaDaoImpl;
import com.javamadman.entitys.Area;
import com.javamadman.service.AreaService;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 9:07
 *
 * @author zx
 */
public class AreaServiceImpl implements AreaService {

    AreaDao areaDao = new AreaDaoImpl();


    @Override
    public List<Area> findAll() throws Exception {
        List<Area> all = areaDao.findAll();
        return all;
    }
}
