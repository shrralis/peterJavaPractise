package com.cuteBrick.javaPractice.dao;

import com.cuteBrick.javaPractice.entity.Categories;

import java.util.List;

public interface CategoriesDao {

    Categories getById(long id);

    void save(Categories categories);

    void update(Categories categories);

    void delete(Categories categories);

    List<Categories> getAllCategories();


}
