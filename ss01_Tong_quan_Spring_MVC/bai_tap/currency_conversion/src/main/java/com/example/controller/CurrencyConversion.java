package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CurrencyConversion {
    @GetMapping("/")
    public String convertCurrency(){
        return "/currency";
    }

    @PostMapping("/")
    public String result(@RequestParam double rate, @RequestParam double usd, Model model){
        double result = rate * usd;
        model.addAttribute("result", result);
        return "/currency";
    }
}
