package com.cuteBrick.javaPractice.service.impl;

import com.cuteBrick.javaPractice.dao.CategoriesDao;
import com.cuteBrick.javaPractice.dao.ItemsDao;
import com.cuteBrick.javaPractice.dto.ItemsDto;
import com.cuteBrick.javaPractice.entity.Categories;
import com.cuteBrick.javaPractice.entity.Items;
import com.cuteBrick.javaPractice.service.ItemsService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.annotation.PostConstruct;
import java.util.ArrayList;
import java.util.List;

@Service
public class ItemsServiceImpl implements ItemsService {

    ModelMapper mm = new ModelMapper();

    @Autowired
    ItemsDao itemsDao;

    @Autowired
    CategoriesDao categoriesDao;

    @PostConstruct
    private void init(){
        mm.createTypeMap(Items.class, ItemsDto.class).addMapping(source->source.getCategory().getId(), ItemsDto::setCategory);
        mm.createTypeMap(ItemsDto.class, Items.class).addMapping(source->categoriesDao.getById(source.getCategory()), Items::setCategory);
    }

    @Override
    public void create(ItemsDto items) {
        Items map = mm.map(items, Items.class);
        itemsDao.save(map);
    }

    @Override
    public void delete(ItemsDto items) {
        Items map = mm.map(items, Items.class);
        itemsDao.delete(map);
    }

    @Override
    public void update(ItemsDto items) {
        Items byId = itemsDao.getById(items.getId());
        Items map = mm.map(items, Items.class);
        if (byId != null){
            itemsDao.update(map);
        }
    }

    @Override
    public ItemsDto getById(long id) {
        Items items = itemsDao.getById(id);
        ItemsDto map = mm.map(items, ItemsDto.class);
        return map;
    }

    @Override
    public List<ItemsDto> getByName(String name) {
        List<Items> byText = itemsDao.getByText(name);
        ListItemsDto map = mm.map(byText, ListItemsDto.class);
        return map;
    }

    @Override
    public List<ItemsDto> getAll() {
        List<Items> allItems = itemsDao.findAllItems();
        ListItemsDto map = mm.map(allItems, ListItemsDto.class);
        return map;
    }

    @Override
    public void buy(ItemsDto items) {
        //TBD
    }

    @Override
    public List<ItemsDto> getByCategory(Categories categories) {
        List<Items> byCategory = itemsDao.getByCategory(categories);
        ListItemsDto map = mm.map(byCategory, ListItemsDto.class);
        return map;
    }

    private class ListItemsDto extends ArrayList<ItemsDto>{

    }
}
