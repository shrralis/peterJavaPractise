package com.cuteBrick.javaPractice.service;

import com.cuteBrick.javaPractice.entity.Categories;
import com.cuteBrick.javaPractice.entity.Items;

import java.util.List;

public interface ItemsService {

    void create(Items items);

    void delete(Items items);

    void update(Items items);

    Items getById(long id);

    List<Items> getByName(String name);

    List<Items> getAll();

    void buy(Items items);

    List<Items> getByCategory(Categories categories);
}
