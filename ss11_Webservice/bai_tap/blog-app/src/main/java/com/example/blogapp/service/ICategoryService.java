package com.example.blogapp.service;

import com.example.blogapp.model.Category;

import java.util.List;

public interface ICategoryService {
    List<Category> getAllCategory();

    Category getCategory(int id);
    void saveCategory(Category category);
    void deleteCategory(int id);
}
