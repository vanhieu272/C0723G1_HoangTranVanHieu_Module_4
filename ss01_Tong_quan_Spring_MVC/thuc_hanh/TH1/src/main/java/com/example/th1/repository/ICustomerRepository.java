package com.example.th1.repository;

import com.example.th1.model.Customer;

import java.util.List;

public interface ICustomerRepository {
    List<Customer> getAll();

    void update();

    Customer getDetail(int id);
}
