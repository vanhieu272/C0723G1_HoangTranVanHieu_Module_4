package com.example.template.repository;

import com.example.template.model.Login;
import com.example.template.model.User;

public interface IUserRepository {
    User checkLogin(Login login);
}
