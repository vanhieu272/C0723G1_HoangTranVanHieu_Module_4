package com.example.service;

import com.example.model.Product;

import java.util.List;

public interface IProductService {
    List<Product> getAll();

    Product getById(int id);

    void add(Product product);

    void update(Product product);

    void remove(int id);

    List<Product> searchByName(String name);
}
