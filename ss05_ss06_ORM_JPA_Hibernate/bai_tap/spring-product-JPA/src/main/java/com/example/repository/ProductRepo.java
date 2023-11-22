package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo implements IProductRepo {

    @PersistenceContext
    private EntityManager entityManager;

//    private static List<Product> products;
//    static {
//        products = new ArrayList<>();
//        products.add(new Product(1, "Sách", 100000, "Muôn kiếp nhân sinh", "NXB Kim Đồng"));
//        products.add(new Product(2, "Vở", 10000, "200 trang", "NXB Kim Đồng"));
//        products.add(new Product(3, "Bút", 50000, "Ngòi nhỏ", "NXB Kim Đồng"));
//        products.add(new Product(4, "Thước", 12000, "30cm", "NXB Kim Đồng"));
//        products.add(new Product(5, "Tẩy", 8000, "200DP", "NXB Kim Đồng"));
//    }

    @Override
    public List<Product> getAll() {
        List<Product> products = new ArrayList<>();
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p", Product.class);
        products = query.getResultList();
        return products;
    }

    @Override
    public Product getById(int id) {
        Product product = entityManager.find(Product.class, id);
        return product;
    }

    @Transactional
    @Override
    public void add(Product product) {
        entityManager.persist(product);
    }

    @Transactional
    @Override
    public void update(Product product) {
        Product productEdit = getById(product.getId());
            productEdit.setName(product.getName());
            productEdit.setPrice(product.getPrice());
            productEdit.setDescription(product.getDescription());
            productEdit.setManufacturer(product.getManufacturer());
            entityManager.merge(product);
    }

    @Transactional
    @Override
    public void remove(int id) {
        Product productRemove = getById(id);
        entityManager.remove(productRemove);
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> products = new ArrayList<>();
        TypedQuery<Product> query = entityManager.createQuery("select p from Product p where p.name like :name ", Product.class);
        query.setParameter("name", "%" + name + "%");
        products = query.getResultList();
        return products;
    }
}
