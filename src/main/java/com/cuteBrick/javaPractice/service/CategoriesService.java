package com.cuteBrick.javaPractice.service;

import com.cuteBrick.javaPractice.entity.Categories;

import java.util.List;

public interface CategoriesService {

    void create(Categories categories);

    Categories getById(long id);

    List<Categories> getByName(String name);

    List<Categories> getAll();

    void update(Categories categories);

    void delete(Categories categories);
}
