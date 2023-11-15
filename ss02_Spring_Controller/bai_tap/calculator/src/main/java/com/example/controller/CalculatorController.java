package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

@Controller
public class CalculatorController {
    @GetMapping("/")
    public String showList(){
        return "/list";
    }

    @PostMapping("/calc")
    public String result(@RequestParam int number1, @RequestParam int number2, @RequestParam String calculation , Model model){
        String result = "";
        switch (calculation){
            case "+":
                result = String.valueOf (number1 + number2);
                break;
            case "-":
                result = String.valueOf (number1 - number2);
                break;
            case "*":
                result = String.valueOf (number1 * number2);
                break;
            case "/":
                if(number2 == 0){
                    result = "Can not division by 0";
                }else {
                    result = String.valueOf(number1 / number2);
                }
                break;
        }
        model.addAttribute("result", result);
        return "/list";
    }
}
