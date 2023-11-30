package com.example.borrowbookapp.repository;

import com.example.borrowbookapp.model.BookLoanCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookLoanCodeRepository extends JpaRepository<BookLoanCode, Integer> {

}
