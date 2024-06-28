package com.prog.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.ModelAttribute;

import com.prog.entity.UserDtls;
import com.prog.repository.UserRepository;

@Controller
public class UserController {
    
    @Autowired
    private UserRepository repo;
    
    @GetMapping("/home")
    public String home() {
        return "index";
    }
    
    @PostMapping("/register")
    public String register(@ModelAttribute UserDtls u) {
        System.out.println(u);
        repo.save(u); // Save the user details
        return "redirect:/"; // Redirect to home page after saving
    }
}
