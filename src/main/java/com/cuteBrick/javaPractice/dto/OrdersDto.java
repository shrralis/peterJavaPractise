package com.cuteBrick.javaPractice.dto;

import com.cuteBrick.javaPractice.entity.ItemOrders;
import com.cuteBrick.javaPractice.entity.Orders;
import com.cuteBrick.javaPractice.entity.Users;

import java.time.LocalDateTime;
import java.util.Set;

public class OrdersDto {

    private long id;
    private double fullPrice;
    private LocalDateTime time;
    private Users user;
    private Orders.Status status;
    private Set<ItemOrders> itemOrders;

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public double getFullPrice() {
        return fullPrice;
    }

    public void setFullPrice(double fullPrice) {
        this.fullPrice = fullPrice;
    }

    public LocalDateTime getTime() {
        return time;
    }

    public void setTime(LocalDateTime time) {
        this.time = time;
    }

    public Users getUser() {
        return user;
    }

    public void setUser(Users user) {
        this.user = user;
    }

    public Orders.Status getStatus() {
        return status;
    }

    public void setStatus(Orders.Status status) {
        this.status = status;
    }

    public Set<ItemOrders> getItemOrders() {
        return itemOrders;
    }

    public void setItemOrders(Set<ItemOrders> itemOrders) {
        this.itemOrders = itemOrders;
    }
}
