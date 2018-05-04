package com.cuteBrick.javaPractice.service.impl;

import com.cuteBrick.javaPractice.dao.CategoriesDao;
import com.cuteBrick.javaPractice.dto.CategoriesDto;
import com.cuteBrick.javaPractice.entity.Categories;
import com.cuteBrick.javaPractice.service.CategoriesService;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class CategoriesServiceImpl implements CategoriesService {
    private ModelMapper mm = new ModelMapper();

    @Autowired
    CategoriesDao categoriesDao;

    @Override
    public void create(CategoriesDto categories) {
        Categories map = mm.map(categories, Categories.class);
        categoriesDao.save(map);
    }

    @Override
    public CategoriesDto getById(long id) {
        Categories cat = new Categories();
        return mm.map(cat, CategoriesDto.class);

    }

    @Override
    public List<CategoriesDto> getByName(String name) {
        //TBD
        return null;
    }

    @Override
    public List<CategoriesDto> getAll() {
        List<Categories> allCategories = categoriesDao.getAllCategories();
        CategoriesListDto map = mm.map(allCategories, CategoriesListDto.class);
        return map;
    }

    @Override
    public void update(CategoriesDto categories) {
        Categories byId = categoriesDao.getById(categories.getId());
        Categories map = mm.map(categories, Categories.class);
        if (byId != null){
            categoriesDao.update(map);
        }
    }

    @Override
    public void delete(CategoriesDto categories) {
        Categories map = mm.map(categories, Categories.class);
        categoriesDao.delete(map);
    }

    private class CategoriesListDto extends ArrayList<CategoriesDto>{

    }
}
