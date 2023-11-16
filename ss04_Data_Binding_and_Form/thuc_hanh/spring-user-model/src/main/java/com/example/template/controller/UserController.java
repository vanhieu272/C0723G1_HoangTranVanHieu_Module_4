package com.example.template.controller;

import com.example.template.model.Login;
import com.example.template.model.User;
import com.example.template.repository.UserRepository;
import com.example.template.service.IUserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.servlet.ModelAndView;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping
    public ModelAndView home(){
        return new ModelAndView("/home", "login", new Login());
    }

    @PostMapping("/login")
    public ModelAndView login(@ModelAttribute("login") Login login){
        User user = userService.checkLogin(login);
        if(user == null){
            return new ModelAndView("/error");
        } else {
            return new ModelAndView("/user", "user", user);
        }
    }
}
