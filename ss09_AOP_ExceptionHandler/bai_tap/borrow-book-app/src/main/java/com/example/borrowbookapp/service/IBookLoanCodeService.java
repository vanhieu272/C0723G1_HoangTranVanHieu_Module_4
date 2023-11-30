package com.example.borrowbookapp.service;

import com.example.borrowbookapp.model.BookLoanCode;

public interface IBookLoanCodeService {
    void create(BookLoanCode bookLoanCode);

    BookLoanCode findByCode(int code);

    int generateRandomCode();
}
