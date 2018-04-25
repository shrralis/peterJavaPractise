package com.cuteBrick.javaPractice.dao;

import com.cuteBrick.javaPractice.entity.Items;

import java.util.List;

public interface ItemsDao {

    Items getById(long id);

    void save(Items items);

    void update(Items items);

    void delete(Items items);

    List<Items> findAllItems();

    List<Items> getByText(String text);
}
