package com.management.college.controller;

import com.management.college.entity.Users;
import com.management.college.services.RolesService;
import com.management.college.services.UsersService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;

@Controller
public class UserController {
    @Autowired
    private UsersService userService;

    @Autowired
    private RolesService roleService;
    @Autowired
    private BCryptPasswordEncoder bCryptPasswordEncoder;
    @GetMapping("add-user")
    public String addUser(Model model) {

        model.addAttribute("rol", roleService.findall());
        model.addAttribute("user", new Users());
        return "create_users";
    }
    @PostMapping("add-user")
    public String registerUserAccount(Model model, Users user) {
        user.setPassword(bCryptPasswordEncoder.encode(user.getPassword()));
        user.setActive(true);
        userService.save(user);

        return "redirect:/add-user";
    }
}
