package com.cuteBrick.javaPractice.service.impl;

import com.cuteBrick.javaPractice.entity.Categories;
import com.cuteBrick.javaPractice.entity.Items;
import com.cuteBrick.javaPractice.service.ItemsService;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {
    @Override
    public void create(Items items) {

    }

    @Override
    public void delete(Items items) {

    }

    @Override
    public void update(Items items) {

    }

    @Override
    public Items getById(long id) {
        return null;
    }

    @Override
    public List<Items> getByName(String name) {
        return null;
    }

    @Override
    public List<Items> getAll() {
        return null;
    }

    @Override
    public void buy(Items items) {

    }

    @Override
    public List<Items> getByCategory(Categories categories) {
        return null;
    }
}
