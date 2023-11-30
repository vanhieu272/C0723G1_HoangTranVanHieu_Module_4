package com.example.borrowbookapp.service;

import com.example.borrowbookapp.model.BookLoanCode;
import com.example.borrowbookapp.repository.IBookLoanCodeRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class BookLoanCodeService implements IBookLoanCodeService{
    @Autowired
    private IBookLoanCodeRepository bookLoanCodeRepository;

    @Override
    public void create(BookLoanCode bookLoanCode) {
        bookLoanCodeRepository.save(bookLoanCode);
    }

    @Override
    public BookLoanCode findByCode(int code) {
        return bookLoanCodeRepository.findByCode(code);
    }

    @Override
    public int generateRandomCode() {
        int code = (int) (Math.random() * 20001) + 10000;
        BookLoanCode bookLoanCode = new BookLoanCode();
        bookLoanCode = bookLoanCodeRepository.findByCode(code);
        if (bookLoanCode != null) {
            generateRandomCode();
        }
        return code;
    }
}
