package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.LinkedHashMap;
import java.util.Map;

@Controller
public class DictionaryController {

    @GetMapping("/")
    public String directory(Model model, @RequestParam(defaultValue = "") String vocab) {
        String result = null;
        vocab = vocab.toLowerCase();
        Map<String, String> dictionaryMap = new LinkedHashMap<>();
        dictionaryMap.put("yellow", "vàng");
        dictionaryMap.put("blue", "xanh dương");
        dictionaryMap.put("green", "xanh lá");
        dictionaryMap.put("red", "đỏ");
        dictionaryMap.put("black", "đen");
        dictionaryMap.put("white", "trắng");
        dictionaryMap.put("pink", "hồng");
        result = dictionaryMap.get(vocab);
        model.addAttribute("vocab", vocab);
        model.addAttribute("result", result);
        return "/dictionary";
    }
}
