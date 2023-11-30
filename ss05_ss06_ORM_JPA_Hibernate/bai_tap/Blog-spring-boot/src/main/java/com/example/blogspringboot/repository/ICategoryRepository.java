package com.example.blogspringboot.repository;

import com.example.blogspringboot.model.Category;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface ICategoryRepository extends JpaRepository<Category, Integer> {

}
