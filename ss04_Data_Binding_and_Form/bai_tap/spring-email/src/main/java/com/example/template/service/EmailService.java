package com.example.template.service;

import com.example.template.model.Email;
import com.example.template.repository.IEmailRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class EmailService implements IEmailService{
    @Autowired
    private IEmailRepo emailRepo;

    @Override
    public Email showEmail() {
        return emailRepo.showEmail();
    }

    @Override
    public Email findById(int id) {
        return emailRepo.findById(id);
    }

    @Override
    public void update(Email email) {
        emailRepo.update(email);
    }

    @Override
    public List<String> getAllLanguagesList() {
        return emailRepo.getAllLanguagesList();
    }

    @Override
    public List<Integer> getAllPages() {
        return emailRepo.getAllPages();
    }
}
