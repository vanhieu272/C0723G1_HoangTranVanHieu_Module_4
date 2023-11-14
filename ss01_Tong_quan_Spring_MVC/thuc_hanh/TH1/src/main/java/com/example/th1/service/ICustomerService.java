package com.example.th1.service;

import com.example.th1.model.Customer;

import java.util.List;

public interface ICustomerService {
    List<Customer> getAll();

    Customer getDetail(int id);
}
