package com.cuteBrick.javaPractice.dao;

import com.cuteBrick.javaPractice.entity.Units;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;
@Repository
public class UnitsDaoImpl implements UnitsDao {

    /*@Autowired
    HibernateTemplate hibernateTemplate;*/
    @Autowired
    SessionFactory sessionFactory;

    protected Session getSession() {
        return this.sessionFactory.getCurrentSession();
    }

    @SuppressWarnings("unchecked")
    @Override
    public List<Units> getAllUnits() {
        return getSession().createQuery("FROM Units").list();
    }

    @Override
    public void createUnits(Units units) {
        getSession().save(units);
    }

    @Override
    public void delete(Units units) {
        getSession().delete(units);
    }
}
