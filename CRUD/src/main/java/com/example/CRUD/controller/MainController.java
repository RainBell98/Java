package com.example.CRUD.controller;


import com.example.CRUD.domain.Person;
import com.example.CRUD.dto.PersonDTO;
import com.example.CRUD.service.MainService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
public class MainController {

    @Autowired
    private MainService mainService;
    @GetMapping("/signin")
    public String getSignIn(Model model) {
        return "signin";
    }
    @GetMapping("/signup")
    public String getSignUp(Model model){
        return "signup";
    }

    @PostMapping("/signin")
    @ResponseBody
    public PersonDTO postSignIn(@RequestBody PersonDTO personDTO){

        return mainService.getPerson(personDTO);
    }
    @PostMapping("/signup")
    @ResponseBody
    public boolean postSignUp(@RequestBody PersonDTO personDTO, Model model){
        mainService.insertPerson(personDTO);
        return true;
    }
}
