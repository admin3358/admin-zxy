package com.javamadman.service;

import com.javamadman.entitys.Area;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 9:03
 *
 * @author zx
 */
public interface AreaService {
    List<Area> findAll() throws Exception;

}
