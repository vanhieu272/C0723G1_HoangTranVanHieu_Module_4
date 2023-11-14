package com.example.th1.repository.impl;

import com.example.th1.model.Customer;
import com.example.th1.repository.ICustomerRepository;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class CustomerRepository implements ICustomerRepository {
    private static List<Customer> customerList = new ArrayList<>();
    static {
        customerList.add(new Customer(1, "Thuan", "thuan@gmail.com", "Quang Binh"));
        customerList.add(new Customer(2, "Hieu", "thuan@gmail.com", "Quang Binh"));
        customerList.add(new Customer(3, "Tuan ngu", "thuan@gmail.com", "Quang Binh"));
        customerList.add(new Customer(4, "Tuong", "thuan@gmail.com", "Quang Binh"));

    }
    @Override
    public List<Customer> getAll() {
        return customerList;
    }

    @Override
    public void update() {

    }

    @Override
    public Customer getDetail(int id) {
        for(Customer customer : customerList){
            if(customer.getId() == id){
                return customer;
            }
        }
        return null;
    }
}
