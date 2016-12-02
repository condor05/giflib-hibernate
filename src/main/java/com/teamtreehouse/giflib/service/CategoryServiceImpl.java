package com.teamtreehouse.giflib.service;

import com.teamtreehouse.giflib.dao.CategoryDao;
import com.teamtreehouse.giflib.model.Category;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CategoryServiceImpl implements CategoryService {
    @Autowired
    private CategoryDao categoryDao;

    @Override
    public Iterable<Category> findAll() {
        return categoryDao.findAll();
    }

    @Override
    public Category findById(Long id) {
        return categoryDao.findOne(id);
    }

    @Override
    public Category save(Category category) {
        return categoryDao.save(category);
    }

    @Override
    public void delete(Category category) {
        categoryDao.delete(category);
    }
}
