package com.example.JDBC.controller;

import com.example.JDBC.domain.User;
import com.example.JDBC.dto.UserDTO;
import com.example.JDBC.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.ArrayList;
import java.util.Arrays;

@Controller
public class MainController {
    @Autowired
    private MainService mainService;

    @GetMapping("/users")
    public String getUsers(Model model){
        ArrayList<UserDTO> userList = (ArrayList<UserDTO>) mainService.getUserList();
        model.addAttribute("list",userList);
        return "user";
    }

    @GetMapping("/user/insert")
    public String getInsertUser(@RequestParam String name, @RequestParam String address, Model model){
        User user = new User();
        user.setName(name);
        user.setAddress(address);
        mainService.addUser(user);
        model.addAttribute("list",null);
        return "user";
    }

}