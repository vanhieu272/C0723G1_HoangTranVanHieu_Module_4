package com.example.blogspringboot.service;

import com.example.blogspringboot.model.Category;

import java.util.List;


public interface ICategoryService {
    List<Category> findAll();
}
