package com.cuteBrick.javaPractice.service.impl;

import com.cuteBrick.javaPractice.entity.Categories;
import com.cuteBrick.javaPractice.entity.Items;
import com.cuteBrick.javaPractice.entity.Orders;
import com.cuteBrick.javaPractice.entity.Users;
import com.cuteBrick.javaPractice.service.OrdersService;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.util.List;

@Service
public class OrdersServiceImpl implements OrdersService{
    @Override
    public void create(Orders orders) {

    }

    @Override
    public void delete(Orders orders) {

    }

    @Override
    public void update(Orders orders) {

    }

    @Override
    public List<Orders> getByItem(Items items) {
        return null;
    }

    @Override
    public Orders getById(long id) {
        return null;
    }

    @Override
    public List<Orders> getByCategory(Categories categories) {
        return null;
    }

    @Override
    public List<Orders> getByStatus(String status) {
        return null;
    }

    @Override
    public List<Orders> getByUser(Users users) {
        return null;
    }

    @Override
    public List<Orders> getFromTime(LocalDateTime ldt) {
        return null;
    }

    @Override
    public List<Orders> getBeforeTime(LocalDateTime ldt) {
        return null;
    }
}
