package com.example.th1.controller;

import com.example.th1.model.Customer;
import com.example.th1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import javax.print.DocFlavor;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/")
    public String showList(Model model){
        List<Customer> customerList = customerService.getAll();
        model.addAttribute("customerList", customerList);
        return "/customer/list";
    }

    @GetMapping("/detail")
    public String showDetail(Model model, @RequestParam("id") int id){
        Customer customer = customerService.getDetail(id);
        model.addAttribute("customer", customer);
        return "/customer/detail";
    }

    
}
