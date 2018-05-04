package com.cuteBrick.javaPractice.service;

import com.cuteBrick.javaPractice.dto.OrdersDto;
import com.cuteBrick.javaPractice.entity.Categories;
import com.cuteBrick.javaPractice.entity.Items;
import com.cuteBrick.javaPractice.entity.Orders;
import com.cuteBrick.javaPractice.entity.Users;

import java.time.LocalDateTime;
import java.util.List;

public interface OrdersService {

    void create(OrdersDto orders);

    void delete(OrdersDto orders);

    void update(OrdersDto orders);

    List<OrdersDto> getByItem(Items items);

    OrdersDto getById(long id);

    List<OrdersDto> getByCategory(Categories categories);

    List<OrdersDto> getByStatus(Orders.Status status);

    List<OrdersDto> getByUser(Users users);

    List<OrdersDto> getFromTime(LocalDateTime ldt);

    List<OrdersDto> getBeforeTime(LocalDateTime ldt);

    List<OrdersDto> getAll();
}
