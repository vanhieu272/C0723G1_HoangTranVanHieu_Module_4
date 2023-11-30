package com.example.borrowbookapp.controller;

import com.example.borrowbookapp.model.Book;
import com.example.borrowbookapp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;

    @GetMapping
    public String showList(Model model){
        List<Book> bookList = bookService.getAllBooks();
        model.addAttribute("bookList", bookList);
        return "/book/list";
    }

    @GetMapping("/detail/{id}")
    public String showDetail(@PathVariable int id, Model model){
        Book book = bookService.findBookById(id);
        model.addAttribute("book", book);
        return "/book/detail";
    }
}
