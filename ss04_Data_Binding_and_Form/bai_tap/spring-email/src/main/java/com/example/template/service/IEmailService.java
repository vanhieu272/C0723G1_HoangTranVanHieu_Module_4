package com.example.template.service;

import com.example.template.model.Email;

import java.util.List;

public interface IEmailService {
    Email showEmail();

    Email findById(int id);

    void update(Email email);

    List<String> getAllLanguagesList();

    List<Integer> getAllPages();
}
