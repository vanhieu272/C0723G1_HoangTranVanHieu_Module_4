package com.example.template.service;

import com.example.template.model.Login;
import com.example.template.model.User;

public interface IUserService {
    User checkLogin(Login login);
}
