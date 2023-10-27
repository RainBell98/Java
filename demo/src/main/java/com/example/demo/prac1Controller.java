package com.example.demo;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class prac1Controller {
    //get router랑 비슷
    @GetMapping("/prc1")
    public String getAge(Model model){ //Model model : 컨트롤러 클래스 안의 메소드가 파라미터로 받을 수 있는 객체
        model.addAttribute("age",10);
        return "prc1";
    }
}
