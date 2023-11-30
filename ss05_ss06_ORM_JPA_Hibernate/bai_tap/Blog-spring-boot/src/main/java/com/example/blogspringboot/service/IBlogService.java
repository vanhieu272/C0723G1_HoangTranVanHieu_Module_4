package com.example.blogspringboot.service;

import com.example.blogspringboot.model.Blog;
import com.example.blogspringboot.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;

import java.util.List;

public interface IBlogService {
    Page<Blog> findAll(String searchName, Pageable pageable);

    Page<Blog> findByCategoryId(int id);

    Blog findById(int id);

    void save(Blog blog);

    void update(Blog blog);

    void remove(int id);


}
