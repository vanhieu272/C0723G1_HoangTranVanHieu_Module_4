package com.example.th1.controller;

import com.example.th1.model.Customer;
import com.example.th1.service.ICustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import javax.print.DocFlavor;
import java.util.List;

@Controller
public class CustomerController {
    @Autowired
    private ICustomerService customerService;

    @GetMapping("/")
    public String showList(Model model) {
        List<Customer> customerList = customerService.getAll();
        model.addAttribute("customerList", customerList);
        return "/customer/list";
    }

    @GetMapping("/detail")
    public String showDetail(Model model, @RequestParam("id") int id) {
        Customer customer = customerService.getDetail(id);
        model.addAttribute("customer", customer);
        return "/customer/detail";
    }

    @GetMapping("/create")
    public String showAddForm() {
        return "/customer/create";
    }

    @PostMapping("/create")
    public String create(RedirectAttributes attributes,
                         @RequestParam int id,
                         @RequestParam String name,
                         @RequestParam String email,
                         @RequestParam String address
    ) {

        Customer customer = new Customer(id, name, email, address);
        customerService.add(customer);
        attributes.addFlashAttribute("message", "add success!!");
        return "redirect:/";
    }

    @GetMapping("/edit")
    public String showEditForm(@RequestParam int id, Model model) {
        Customer customer = customerService.getDetail(id);
        model.addAttribute("customer", customer);
        return "/customer/edit";
    }

    @PostMapping("/edit")
    public String edit(RedirectAttributes attributes,
                       @RequestParam int id,
                       @RequestParam String name,
                       @RequestParam String email,
                       @RequestParam String address
    ) {

        Customer customer = new Customer(id, name, email, address);
        customerService.update(customer);
        attributes.addFlashAttribute("message", "edit success!!");
        return "redirect:/";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id){
        customerService.delete(id);
        return "redirect:/";
    }
}
