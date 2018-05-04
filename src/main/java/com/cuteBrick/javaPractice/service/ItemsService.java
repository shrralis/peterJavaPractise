package com.cuteBrick.javaPractice.service;

import com.cuteBrick.javaPractice.dto.ItemsDto;
import com.cuteBrick.javaPractice.entity.Categories;
import com.cuteBrick.javaPractice.entity.Items;

import java.util.List;

public interface ItemsService {

    void create(ItemsDto items);

    void delete(ItemsDto items);

    void update(ItemsDto items);

    ItemsDto getById(long id);

    List<ItemsDto> getByName(String name);

    List<ItemsDto> getAll();

    void buy(ItemsDto items);

    List<ItemsDto> getByCategory(Categories categories);
}
