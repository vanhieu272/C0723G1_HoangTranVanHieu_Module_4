package com.example.controller;

import com.example.model.Employee;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.servlet.ModelAndView;

@Controller
@RequestMapping
public class EmployeeController {
    @GetMapping
    public ModelAndView showForm () {
        return new ModelAndView("/employee/create", "employee", new Employee());
    }

    @PostMapping("/addEmployee")
    public ModelAndView create(@ModelAttribute ("employee") Employee employee) {
        return new ModelAndView("/employee/info", "employee", employee);
    }
}
