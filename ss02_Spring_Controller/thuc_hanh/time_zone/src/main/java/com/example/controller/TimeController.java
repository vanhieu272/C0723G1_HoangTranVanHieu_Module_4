package com.example.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Date;
import java.util.TimeZone;

@Controller
public class TimeController {
    @GetMapping("/")
    public String showHome(){
        return "/home";
    }

    @GetMapping("/world-clock")
    public String getTimeByZone(ModelMap model, @RequestParam(name = "city", required = false,
            defaultValue = "Asia/Ho_Chi_Minh") String city){
        Date date = new Date();
        TimeZone local = TimeZone.getDefault();
        TimeZone locale = TimeZone.getTimeZone(city);
        long localeTime = date.getTime() + (locale.getRawOffset() - local.getRawOffset());
        date.setTime(localeTime);
        model.addAttribute("city", city);
        model.addAttribute("date", date);
        return "/home";
    }
}
