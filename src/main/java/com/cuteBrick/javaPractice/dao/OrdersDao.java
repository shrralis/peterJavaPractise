package com.cuteBrick.javaPractice.dao;

import com.cuteBrick.javaPractice.entity.Items;
import com.cuteBrick.javaPractice.entity.Orders;

import java.util.List;

public interface OrdersDao {

    Orders getById(long id);

    void save(Orders orders);

    void update(Orders orders);

    void delete(Orders orders);

    List<Orders> getAllOrders();
}
