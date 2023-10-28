package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;


import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@Controller
public class Person {
    private String name;
    private int age;
    public Person(String name, int age){
        this.name = name;
        this.age = age;
    }

    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    @GetMapping("/people")
    public String getPerson(Model mo){
        Object ArrayList;
        Person person = new Person("kim",20);
        List<Person> infoList = Arrays.asList(person);
        mo.addAttribute("info",infoList);
        return "people";
    }
}
