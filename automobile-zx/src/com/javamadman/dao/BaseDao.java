package com.javamadman.dao;

import java.util.List;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:45
 *
 * @author zx
 */
public interface BaseDao<T> {

    /**
     * 添加
     * @return 影响行数
     */
   int save(T t) throws Exception;

    /**
     * 删除
     * @return 影响行数
     */
   int dele(T t) throws Exception;

    /**
     * 更新
     * @return 影响行数
     */
   int upda(T t) throws Exception;

    /**
     * 查询所有
     */
   List<T> findAll() throws Exception;

    /**
     * 按指定id查询
     * @return 一条记录
     */
   T findObjById(Long id) throws Exception;
}
