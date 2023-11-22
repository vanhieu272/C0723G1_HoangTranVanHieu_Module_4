package com.example.blogspringboot.service;

import com.example.blogspringboot.model.Blog;
import com.example.blogspringboot.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogService implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;

    @Override
    public List<Blog> findAll() {
        return blogRepository.findAll();
    }

    @Override
    public Blog findById(int id) {
        return blogRepository.findById(id).orElse(null);
    }

    @Override
    public void save(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public void update(Blog blog) {
        if (blogRepository.existsById(blog.getId())) {
            blogRepository.save(blog);
        } else {
            throw new IllegalArgumentException("Blog not found");
        }
    }

    @Override
    public void remove(int id) {
        blogRepository.deleteById(id);
    }
}
