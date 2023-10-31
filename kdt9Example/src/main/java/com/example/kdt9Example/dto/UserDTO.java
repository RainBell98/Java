package com.example.kdt9Example.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class UserDTO {
    private String name,age;


    public String getName() {
        return name;
    }

//    public void setName(String name) {
//        this.name = name;
//    }

    public String getAge() {
        return age;
    }

//    public void setAge(String age) {
//        this.age = age;
//    }
}
