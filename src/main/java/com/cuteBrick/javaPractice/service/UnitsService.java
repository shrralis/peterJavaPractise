package com.cuteBrick.javaPractice.service;

import com.cuteBrick.javaPractice.entity.Units;

import java.util.List;

public interface UnitsService {

    void create(Units units);

    void delete(Units units);

    void update(Units units);

    Units getById(long id);

    List<Units> getAll();
}
