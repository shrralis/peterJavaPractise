package com.cuteBrick.javaPractice.dao.impl;

import com.cuteBrick.javaPractice.dao.ItemsDao;
import com.cuteBrick.javaPractice.entity.Items;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class ItemsDaoImpl implements ItemsDao {

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @Override
    public Items getById(long id) {
        return getSession().get(Items.class, id);
    }

    @Override
    public void delete(Items items) {
        getSession().delete(items);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Items> findAllItems() {
        return getSession().createQuery("FROM Items").list();
    }

    public void save(Items items)  {
        getSession().save(items);
    }

    public void update(Items items) {
        getSession().update(items);
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Items> getByText(String word) {
        return getSession().createQuery("FROM Items WHERE LOWER (CONCAT(name, description)) LIKE LOWER (:word)")
                .setParameter("word", "%" + word + "%")
                .list();
    }
}
