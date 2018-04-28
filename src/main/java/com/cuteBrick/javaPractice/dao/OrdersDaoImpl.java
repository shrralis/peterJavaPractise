package com.cuteBrick.javaPractice.dao;

import com.cuteBrick.javaPractice.entity.Items;
import com.cuteBrick.javaPractice.entity.Orders;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class OrdersDaoImpl implements OrdersDao{

    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }


    @Override
    public Orders getById(long id) {
        return getSession().get(Orders.class, id);
    }

    @Override
    public void save(Orders orders) {
        getSession().save(orders);
    }

    @Override
    public void update(Orders orders) {
        getSession().update(orders);
    }

    @Override
    public void delete(Orders orders) {
        getSession().delete(orders);
    }

    @Override
    public List<Orders> getAllOrders() {
        return getSession().createQuery("FROM Orders").list();
    }
}
