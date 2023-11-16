package com.example.template.repository;

import com.example.template.model.Email;

import java.util.List;

public interface IEmailRepo {
    Email showEmail();

    Email findById(int id);

    void update(Email email);

    List<String> getAllLanguagesList();

    List<Integer> getAllPages();
}
