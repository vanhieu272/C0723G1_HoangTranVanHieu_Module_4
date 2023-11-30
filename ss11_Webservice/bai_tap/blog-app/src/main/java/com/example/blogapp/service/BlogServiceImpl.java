package com.example.blogapp.service;

import com.example.blogapp.model.Blog;
import com.example.blogapp.repository.IBlogRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BlogServiceImpl implements IBlogService {
    @Autowired
    private IBlogRepository blogRepository;
    @Override
    public void createNewBlog(Blog blog) {
        blogRepository.save(blog);
    }

    @Override
    public List<Blog> getAllBlog() {
        return blogRepository.findAll();
    }

    @Override
    public void update(Blog blog) {
        if (blogRepository.existsById(blog.getId())) {
            blogRepository.save(blog);
        } else {
            throw new IllegalArgumentException("Not found blog with id " + blog.getId());
        }
    }

    @Override
    public void delete(int id) {
        blogRepository.deleteById(id);
    }

    @Override
    public Blog getBlog(int id) {
        return blogRepository.findById(id).get();
    }

    @Override
    public List<Blog> getBlogByIdCategory(int id) {
        return blogRepository.getBlogByIdCategory(id);
    }

    @Override
    public Page<Blog> search(String name, Pageable pageable) {
        return blogRepository.search(name, pageable);
    }

    @Override
    public Page<Blog> displayAllBlog(String name, Pageable pageable) {
        return blogRepository.search("%" + name + "%", pageable);
    }

    @Override
    public Page<Blog> searchByCategory(Pageable pageable, int idCate) {
        return blogRepository.searchByCategory(pageable, idCate);
    }

    @Override
    public Page<Blog> searchByCategoryAndName(String name, Pageable pageable, int idCate) {
        return blogRepository.searchByCategoryAndName("%" + name + "%", pageable, idCate);
    }


}

