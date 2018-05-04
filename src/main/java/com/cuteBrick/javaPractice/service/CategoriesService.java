package com.cuteBrick.javaPractice.service;

import com.cuteBrick.javaPractice.dto.CategoriesDto;
import com.cuteBrick.javaPractice.entity.Categories;

import java.util.List;

public interface CategoriesService {

    void create(CategoriesDto categories);

    CategoriesDto getById(long id);

    List<CategoriesDto> getByName(String name);

    List<CategoriesDto> getAll();

    void update(CategoriesDto categories);

    void delete(CategoriesDto categories);
}
