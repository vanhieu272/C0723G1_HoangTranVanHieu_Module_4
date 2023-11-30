package com.example.blogspringboot.controller;

import com.example.blogspringboot.model.Blog;
import com.example.blogspringboot.model.Category;
import com.example.blogspringboot.service.IBlogService;
import com.example.blogspringboot.service.ICategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.awt.print.Pageable;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;


@Controller
@RequestMapping("/blog")
public class BlogController {
    @Autowired
    private IBlogService blogService;
    @Autowired
    private ICategoryService categoryService;

    @GetMapping
    public String showHome(@RequestParam(defaultValue = "0") int page,
                           @RequestParam(defaultValue = "") String searchName,
                           Model model
                           ){
        Pageable pageable = (Pageable) PageRequest.of(page, 2, Sort.by("datePost").ascending());
        Page<Blog> blogPage = blogService.findByCategoryId();
    }

    @GetMapping("/detail")
    public String showDetail(Model model, @RequestParam int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "/detail";
    }

    @GetMapping("/create")
    public String showCreate(Model model) {
        model.addAttribute("categoryList", categoryService.findAll());
        model.addAttribute("blog", new Blog());
        return "/create";
    }

    @PostMapping("/save")
    public String save(Blog blog, RedirectAttributes redirectAttributes) {
        blog.setDatePost(LocalDateTime.now());
        blogService.save(blog);
        redirectAttributes.addFlashAttribute("success", "Added blog is successfully!!");
        return "redirect:/blog";
    }

    @GetMapping("/edit")
    public String showEdit(Model model, @RequestParam int id) {
        model.addAttribute("blog", blogService.findById(id));
        return "/edit";
    }

    @PostMapping("/update")
    public String update(Blog blog, RedirectAttributes attributes) {
        blogService.update(blog);
        attributes.addFlashAttribute("success", "Edited blog successfully!");
        return "redirect:/blog";
    }

    @GetMapping("/delete")
    public String delete(@RequestParam int id, RedirectAttributes attributes) {
        blogService.remove(id);
        attributes.addFlashAttribute("success", "Deleted blog successfully!");
        return "redirect:/blog";
    }
}

