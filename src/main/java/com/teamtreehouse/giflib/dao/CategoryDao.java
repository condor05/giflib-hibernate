package com.teamtreehouse.giflib.dao;

import com.teamtreehouse.giflib.model.Category;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface CategoryDao extends CrudRepository<Category, Long> {
}
