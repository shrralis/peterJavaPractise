package com.cuteBrick.javaPractice.service;

import com.cuteBrick.javaPractice.entity.Categories;
import com.cuteBrick.javaPractice.entity.Items;
import com.cuteBrick.javaPractice.entity.Orders;
import com.cuteBrick.javaPractice.entity.Users;

import java.time.LocalDateTime;
import java.util.List;

public interface OrdersService {

    void create(Orders orders);

    void delete(Orders orders);

    void update(Orders orders);

    List<Orders> getByItem(Items items);

    Orders getById(long id);

    List<Orders> getByCategory(Categories categories);

    List<Orders> getByStatus(String status);

    List<Orders> getByUser(Users users);

    List<Orders> getFromTime(LocalDateTime ldt);

    List<Orders> getBeforeTime(LocalDateTime ldt);
}
