package com.cuteBrick.javaPractice.dao;

import com.cuteBrick.javaPractice.entity.Units;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.orm.hibernate5.HibernateTemplate;

import java.util.List;

public class UnitsDaoImpl implements UnitsDao {

    @Autowired
    HibernateTemplate hibernateTemplate;

    @SuppressWarnings("unchecked")
    @Override
    public List<Units> getAllUnits() {
        return (List<Units>) hibernateTemplate.find("FROM Units");
    }

    @Override
    public void createUnits(Units units) {
        hibernateTemplate.update(units);
    }

    @Override
    public void delete(Units units) {
        hibernateTemplate.delete(units);
    }
}
