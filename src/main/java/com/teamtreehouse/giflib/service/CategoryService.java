package com.teamtreehouse.giflib.service;

import com.teamtreehouse.giflib.model.Category;

import java.util.List;

public interface CategoryService {
    Iterable<Category> findAll();
    Category findById(Long id);
    Category save(Category category);
    void delete(Category category);
}
