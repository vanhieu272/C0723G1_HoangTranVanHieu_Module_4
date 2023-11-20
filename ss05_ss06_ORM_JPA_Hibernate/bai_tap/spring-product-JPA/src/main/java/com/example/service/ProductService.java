package com.example.service;

import com.example.model.Product;
import com.example.repository.IProductRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProductService implements IProductService{
    @Autowired
    private IProductRepo productRepo;

    @Override
    public List<Product> getAll() {
        return productRepo.getAll();
    }

    @Override
    public Product getById(int id) {
        return productRepo.getById(id);
    }

    @Override
    public void add(Product product) {
        productRepo.add(product);
    }

    @Override
    public void update(Product product) {
        productRepo.update(product);
    }

    @Override
    public void remove(int id) {
        productRepo.remove(id);
    }

    @Override
    public List<Product> searchByName(String name) {
        return productRepo.searchByName(name);
    }
}
