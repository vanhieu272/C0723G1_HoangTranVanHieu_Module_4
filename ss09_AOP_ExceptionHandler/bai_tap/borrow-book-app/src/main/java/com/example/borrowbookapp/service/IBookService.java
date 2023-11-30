package com.example.borrowbookapp.service;

import com.example.borrowbookapp.model.Book;

import java.util.List;

public interface IBookService {
    List<Book> getAllBooks();

    Book findBookById(int id);
}
