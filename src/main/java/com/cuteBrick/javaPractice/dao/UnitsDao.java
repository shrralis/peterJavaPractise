package com.cuteBrick.javaPractice.dao;

import com.cuteBrick.javaPractice.entity.Units;

import java.util.List;

public interface UnitsDao {

    List<Units> getAllUnits();

    void createUnits(Units units);

    void delete(Units units);
}
