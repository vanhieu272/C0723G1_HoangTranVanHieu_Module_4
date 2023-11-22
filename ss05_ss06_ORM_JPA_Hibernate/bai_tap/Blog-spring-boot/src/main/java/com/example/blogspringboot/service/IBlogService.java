package com.example.blogspringboot.service;

import com.example.blogspringboot.model.Blog;

import java.util.List;

public interface IBlogService {
    List<Blog> findAll();

    Blog findById(int id);

    void save(Blog blog);

    void update(Blog blog);

    void remove(int id);

}
