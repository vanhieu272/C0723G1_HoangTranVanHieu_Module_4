package com.example.validate_form.controller;


import com.example.validate_form.dto.UserDto;
import com.example.validate_form.model.User;
import com.example.validate_form.service.IUserService;
import jakarta.validation.Valid;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.servlet.mvc.support.RedirectAttributes;

@Controller
public class UserController {
    @Autowired
    private IUserService userService;

    @GetMapping
    public String showForm(Model model){
        model.addAttribute("userDto", new UserDto());
        return "/create";
    }

    @GetMapping("/validate")
    public String save(@Valid @ModelAttribute UserDto userDto, Model model,
                       BindingResult bindingResult){

        User user = new User();
        new UserDto().validate(userDto, bindingResult);

        if (bindingResult.hasErrors()){
            return "/create";
        }
        BeanUtils.copyProperties(userDto, user);
        userService.save(user);
        model.addAttribute("message", "Create new user is successfully!!");
        return "/result";
    }

}
