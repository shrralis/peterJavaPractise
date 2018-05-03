package com.cuteBrick.javaPractice.dao.impl;

import com.cuteBrick.javaPractice.dao.CategoriesDao;
import com.cuteBrick.javaPractice.entity.Categories;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class CategoriesDaoImpl implements CategoriesDao {

    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }


    @Override
    public Categories getById(long id) {
        return getSession().get(Categories.class, id);
    }

    @Override
    public void save(Categories categories) {
        getSession().save(categories);
    }

    @Override
    public void update(Categories categories) {
        getSession().update(categories);
    }

    @Override
    public void delete(Categories categories) {
        getSession().delete(categories);
    }

    @Override
    public List<Categories> getAllCategories() {
        return getSession().createQuery("FROM Categories").list();
    }
}
