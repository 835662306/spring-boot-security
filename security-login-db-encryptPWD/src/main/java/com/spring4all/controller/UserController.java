package com.spring4all.controller;

import com.spring4all.entity.UserEntity;
import com.spring4all.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.annotation.AuthenticationPrincipal;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

import java.security.Principal;

@Controller
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public String admin(@AuthenticationPrincipal Principal principal, Model model){
        model.addAttribute("username", principal.getName());
        return "user/user";
    }

    @GetMapping("/sales")
    public String user(@AuthenticationPrincipal Principal principal, Model model){
        UserEntity user = userService.getByUsername(principal.getName());
        model.addAttribute("username", user);
        return "user/sales";
    }

    @GetMapping("/order")
    public String order(@AuthenticationPrincipal Principal principal, Model model){
        UserEntity user = userService.getByUsername(principal.getName());
        model.addAttribute("username", user);
        return "user/order";
    }

}
