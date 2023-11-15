package com.example.th1.repository;

import com.example.th1.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();


    Customer getDetail(int id);

    void update( Customer customer);

    void add(Customer customer);

    void delete(int id);
}
