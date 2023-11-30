package com.example.borrowbookapp.repository;

import com.example.borrowbookapp.model.BookLoanCode;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

@Repository
public interface IBookLoanCodeRepository extends JpaRepository<BookLoanCode, Integer> {
    @Query(nativeQuery = true, value = "select blc.* from book_loan_code blc left join book b on b.id = blc.id where blc.code = :bookLoanCode")
    BookLoanCode findByCode(@Param("bookLoanCode") int code);
}
