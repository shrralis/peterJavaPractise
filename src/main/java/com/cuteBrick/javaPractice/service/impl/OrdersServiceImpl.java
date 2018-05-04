package com.cuteBrick.javaPractice.service.impl;

import com.cuteBrick.javaPractice.dao.OrdersDao;
import com.cuteBrick.javaPractice.dto.OrdersDto;
import com.cuteBrick.javaPractice.entity.Categories;
import com.cuteBrick.javaPractice.entity.Items;
import com.cuteBrick.javaPractice.entity.Orders;
import com.cuteBrick.javaPractice.entity.Users;
import com.cuteBrick.javaPractice.service.OrdersService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{

    ModelMapper mm = new ModelMapper();

    @Autowired
    OrdersDao ordersDao;

    @Override
    public void create(OrdersDto orders) {
        Orders map = mm.map(orders, Orders.class);
        ordersDao.save(map);
    }

    @Override
    public void delete(OrdersDto orders) {
        Orders map = mm.map(orders, Orders.class);
        ordersDao.delete(map);
    }

    @Override
    public void update(OrdersDto orders) {
        Orders byId = ordersDao.getById(orders.getId());
        Orders map = mm.map(byId, Orders.class);
        if (byId != null){
            ordersDao.update(map);
        }
    }

    @Override
    public List<OrdersDto> getByItem(Items items) {
        //TBD
        return null;
    }

    @Override
    public OrdersDto getById(long id) {
        Orders byId = ordersDao.getById(id);
        return mm.map(byId, OrdersDto.class);
    }

    @Override
    public List<OrdersDto> getByCategory(Categories categories) {
        //TBD
        return null;
    }

    @Override
    public List<OrdersDto> getByStatus(Orders.Status status) {
        //TBD
        return null;
    }

    @Override
    public List<OrdersDto> getByUser(Users users) {
        //TBD
        return null;
    }

    @Override
    public List<OrdersDto> getFromTime(LocalDateTime ldt) {
        //TBD
        return null;
    }

    @Override
    public List<OrdersDto> getBeforeTime(LocalDateTime ldt) {
        //TBD
        return null;
    }

    @Override
    public List<OrdersDto> getAll() {
        List<Orders> allOrders = ordersDao.getAllOrders();
        ListOrdersDto map = mm.map(allOrders, ListOrdersDto.class);
        return map;

    }

    private class ListOrdersDto extends ArrayList<OrdersDto>{

    }
}
