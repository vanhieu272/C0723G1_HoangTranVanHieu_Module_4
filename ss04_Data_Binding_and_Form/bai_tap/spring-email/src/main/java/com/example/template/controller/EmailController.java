package com.example.template.controller;

import com.example.template.model.Email;
import com.example.template.service.IEmailService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

import java.util.List;

@Controller
public class EmailController {
    @Autowired
    private IEmailService emailService;

    @GetMapping
    public ModelAndView showEmailForm(Model model){
        List<String> languagesList = emailService.getAllLanguagesList();
        List<Integer> pages = emailService.getAllPages();
        Email email = emailService.showEmail();
        model.addAttribute("languagesList", languagesList);
        model.addAttribute("pages", pages);
        model.addAttribute("email", email);
        return new ModelAndView("/update");
    }


    @PostMapping("/update")
    public String update(@ModelAttribute Email email, Model model) {
        emailService.update(email);
        model.addAttribute("emails",emailService.findById(email.getId()));
        return "/result";

    }

}
