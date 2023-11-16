package com.example.controller;

import com.example.service.DictionaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import java.util.Map;

@Controller
public class DictionaryController {
    @Autowired
    private DictionaryService dictionaryService;
    @GetMapping("/")
    public String showHome(){
        return "/dictionary";
    }


    @GetMapping("/result")
    public String directory(Model model, @RequestParam(defaultValue = "") String vocab) {
        String result =  dictionaryService.search(vocab);
        model.addAttribute("vocab", vocab);
        model.addAttribute("result", result);
        return "/dictionary";
    }
}
