package com.cuteBrick.javaPractice.dao;

import com.cuteBrick.javaPractice.entity.Users;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public class UsersDaoImpl implements UsersDao{

    @Autowired
    private SessionFactory sessionFactory;

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }


    @Override
    public Users getbyId(long id) {
        return getSession().get(Users.class, id);
    }

    @Override
    public void save(Users users) {
        getSession().save(users);
    }

    @Override
    public void update(Users users) {
        getSession().update(users);
    }

    @Override
    public void delete(Users users) {
        getSession().delete(users);
    }

    @Override
    public List<Users> getAllUsers() {
        return getSession().createQuery("FROM Users").list();
    }
}
