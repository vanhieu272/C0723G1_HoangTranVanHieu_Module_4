package com.example.template.service;

import com.example.template.model.Login;
import com.example.template.model.User;
import com.example.template.repository.IUserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UserService implements IUserService{
    @Autowired
    private IUserRepository userRepo;

    @Override
    public User checkLogin(Login login) {
        return userRepo.checkLogin(login);
    }
}
