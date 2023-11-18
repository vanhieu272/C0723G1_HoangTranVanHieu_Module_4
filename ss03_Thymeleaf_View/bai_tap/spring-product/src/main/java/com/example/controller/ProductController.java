package com.example.controller;

import com.example.model.Product;
import com.example.service.IProductService;
import com.example.service.ProductService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
@RequestMapping("/product")
public class ProductController {
    @Autowired
    private IProductService productService;

    @GetMapping
    public String showHome(Model model) {
        List<Product> productList = productService.getAll();
        model.addAttribute("productList", productList);
        return "/product/home";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("product", new Product());
        return "/product/create";
    }

    @PostMapping("/save")
    public String save(Product product, RedirectAttributes attribute) {
        product.setId((int) (Math.random() * 10000));
        productService.add(product);
        attribute.addFlashAttribute("success", "Added product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/detail")
    public String showDetail(Model model, @RequestParam int id){
        model.addAttribute("product", productService.getById(id));
        return "/product/view";
    }

    @GetMapping("/edit")
    public String showEdit(Model model, @RequestParam int id){
        model.addAttribute("product", productService.getById(id));
        return "/product/edit";
    }

    @PostMapping("/update")
    public String update(Product product, RedirectAttributes attributes){
        productService.update(product);
        attributes.addFlashAttribute("success", "Edited product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes attributes){
        productService.remove(id);
        attributes.addFlashAttribute("success", "Deleted product successfully!");
        return "redirect:/product";
    }

    @GetMapping("/search")
    public String search(String name, Model model){
        List<Product> productList = productService.searchByName(name);
        if(productList.isEmpty()){
            model.addAttribute("success", "This product was not found!!");
        }
        model.addAttribute("name", name);
        model.addAttribute("productList", productList);
        return "/product/home";
    }
}
