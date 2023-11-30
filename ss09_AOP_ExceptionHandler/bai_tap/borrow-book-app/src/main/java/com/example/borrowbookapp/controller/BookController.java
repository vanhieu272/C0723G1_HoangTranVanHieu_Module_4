package com.example.borrowbookapp.controller;

import com.example.borrowbookapp.model.Book;
import com.example.borrowbookapp.model.BookLoanCode;
import com.example.borrowbookapp.service.IBookLoanCodeService;
import com.example.borrowbookapp.service.IBookService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
@RequestMapping("/book")
public class BookController {
    @Autowired
    private IBookService bookService;
    @Autowired
    private IBookLoanCodeService bookLoanCodeService;

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

    @GetMapping("/borrow/{id}")
    public String showBorrowDetail(@PathVariable int id, Model model){
        int code = bookLoanCodeService.generateRandomCode();
        model.addAttribute("code", code);
        BookLoanCode bookLoanCode = new BookLoanCode();
        bookLoanCode.setCode(code);
        Book book = new Book();
        book.setId(id);
        bookLoanCode.setBook(book);
        model.addAttribute("bookLoanCode", bookLoanCode);
        return "/book-loan-code/detail";
    }
}
