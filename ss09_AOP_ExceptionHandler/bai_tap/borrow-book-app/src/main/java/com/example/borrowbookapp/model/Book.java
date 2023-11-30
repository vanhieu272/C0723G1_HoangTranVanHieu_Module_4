package com.example.borrowbookapp.model;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

import java.util.Set;

@Entity
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Book {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private int id;
    private String name;
    private String author;
    @Column(columnDefinition = "text")
    private String img;
    private String summary;
    private int quantity;
    @OneToMany(mappedBy = "book", cascade = CascadeType.ALL)
    private Set<BookLoanCode> bookLoanCodes;
}
