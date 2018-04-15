package com.javamadman.dao.impl;

import com.javamadman.dao.CarDao;
import com.javamadman.entitys.*;
import com.javamadman.utils.DataSourceUtils;
import org.apache.commons.beanutils.BeanUtils;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.MapHandler;
import org.apache.commons.dbutils.handlers.MapListHandler;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

/**
 * Created by IntelliJ IDEA
 * Date: 2018/4/14
 * Time: 10:40
 * 处理汽车相关数据访问方法
 * @author zx
 */
public class CarDaoImpl implements CarDao {

    QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());

    @Override
    public int save(Car car) throws Exception {
        String sql = "insert into car(net_price,ret_price,pre_price) VALUES(?,?,?)";
        return runner.update(sql, car.getNetPrice(),car.getRetPrice(),car.getPrePrice());
    }

    @Override
    public int dele(Car car) throws Exception{
        String sql = "delete from car where id=?";
        return runner.update(sql, car.getId());
    }

    @Override
    public int upda(Car car) throws Exception{
        String sql = "update car set net_price=?,ret_price=?, pre_price=? where id=? ";
        return runner.update(sql,car.getNetPrice(),car.getRetPrice(),car.getPrePrice(),car.getId());
    }

    @Override
    public List<Car> findAll() throws Exception {
        String sql = "select c.id id,net_price netPrice,ret_price retPrice,pre_price prePrice,price,h_name hName,type" +
                "from car c,item i,holder h,kind k,orders o" +
                "where c.id=i.c_id and i.o_id=o.id and c.hol_id=h.id and c.kind_id=k.id";
        List<Map<String, Object>> maps = runner.query(sql, new MapListHandler());
        List<Car> list = new ArrayList<>();
        for(Map<String,Object> map : maps){
            Car car = new Car();
            Item item = new Item();
            Holder holder = new Holder();
            Kind kind = new Kind();
            Orders orders = new Orders();
            BeanUtils.populate(car,map);
            BeanUtils.populate(item,map);
            BeanUtils.populate(holder,map);
            BeanUtils.populate(kind,map);
            BeanUtils.populate(orders,map);

            item.setOrders(orders);
            car.setItem(item);
            car.setHolder(holder);
            car.setKind(kind);

            list.add(car);
        }
        return list;
    }

    @Override
    public Car findObjById(Long id) throws Exception {
        String sql = "select c.id id,net_price netPrice,ret_price retPrice,pre_price prePrice,price,h_name hName,type" +
                "from car c,item i,holder h,kind k,orders o where id=?";
        Map<String, Object> map = runner.query(sql, new MapHandler(),id);
        Car car = new Car();
        Item item = new Item();
        Holder holder = new Holder();
        Kind kind = new Kind();
        Orders orders = new Orders();
        BeanUtils.populate(car,map);
        BeanUtils.populate(item,map);
        BeanUtils.populate(holder,map);
        BeanUtils.populate(kind,map);
        BeanUtils.populate(orders,map);

        item.setOrders(orders);
        car.setItem(item);
        car.setHolder(holder);
        car.setKind(kind);
        return car;
    }
}
