package com.example.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.List;

@Controller
public class SandwichCondimentsController {
   @GetMapping("/")
    public String showHome(){
       return "/home";
   }

    @PostMapping("/save")
    public String result(@RequestParam(defaultValue = "") String Tomato,
                              @RequestParam(defaultValue = "") String Lettuce,
                              @RequestParam(defaultValue = "") String Mustard,
                              @RequestParam(defaultValue = "") String Sprouts,
                              Model model){
        model.addAttribute("spice", Tomato+" "+Lettuce+" "+Mustard+" "+Sprouts);
        if(Tomato.equals("") && Lettuce.equals("") && Mustard.equals("") && Sprouts.equals("")){
            model.addAttribute("spice","No Spices!");
        }
        return "/home";
    }
}
