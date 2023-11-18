package com.example.repository;

import com.example.model.Product;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class ProductRepo implements IProductRepo{
//    private int id;
//
//    private String name;
//    private int price;
//
//    private String description;
//
//    private String manufacturer;
    private static List<Product> products;
    static {
        products = new ArrayList<>();
        products.add(new Product(1, "Sách", 100000, "Muôn kiếp nhân sinh", "NXB Kim Đồng"));
        products.add(new Product(2, "Vở", 10000, "200 trang", "NXB Kim Đồng"));
        products.add(new Product(3, "Bút", 50000, "Ngòi nhỏ", "NXB Kim Đồng"));
        products.add(new Product(4, "Thước", 12000, "30cm", "NXB Kim Đồng"));
        products.add(new Product(5, "Tẩy", 8000, "200DP", "NXB Kim Đồng"));
    }

    @Override
    public List<Product> getAll() {
        return products;
    }

    @Override
    public Product getById(int id) {
        for (Product product : products){
            if(product.getId() == id){
                return product;
            }
        }
        return null;
    }

    @Override
    public void add(Product product) {
        products.add(product);
    }

    @Override
    public void update(Product product) {
        for(Product product1 : products){
            if(product1.getId() == product.getId()){
                product1.setName(product.getName());
                product1.setPrice(product.getPrice());
                product1.setDescription(product.getDescription());
                product1.setManufacturer(product.getManufacturer());
                break;
            }
        }
    }

    @Override
    public void remove(int id) {
        for(Product product1 : products){
            if(product1.getId() ==id){
                products.remove(product1);
                break;
            }
        }
    }

    @Override
    public List<Product> searchByName(String name) {
        List<Product> productList = new ArrayList<>();
        for(Product product : products){
            if (product.getName().toLowerCase().contains(name.toLowerCase())){
                productList.add(product);
            }
        }
    return productList;
    }
}
