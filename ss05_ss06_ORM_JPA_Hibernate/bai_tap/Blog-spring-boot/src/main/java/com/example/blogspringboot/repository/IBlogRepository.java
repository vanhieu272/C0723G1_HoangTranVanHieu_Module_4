package com.example.blogspringboot.repository;

import com.example.blogspringboot.model.Blog;
import com.example.blogspringboot.model.Category;
import org.springframework.data.domain.Page;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.Calendar;
import java.util.List;


public interface IBlogRepository extends JpaRepository<Blog, Integer> {

    @Query(nativeQuery = true, value = "select * from blog b join category c on b.category_id = c.id where c.category_id = :category_id")
    Page<Blog> findByCategoryId(@Param("category_id") int id);
}
