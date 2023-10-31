package com.example.kdt9Example.controller;

import com.example.kdt9Example.dto.UserDTO;
import com.example.kdt9Example.vo.UserInfo;
import com.example.kdt9Example.vo.UserVO;
import org.apache.catalina.User;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

@Controller
//@RestController
public class MainController {
    @GetMapping("/")
    public String getMain(){
        return "request";
    }
    @GetMapping("/get/response1")
    //?key = value
    // /get/response1?name= abc
    // 기본값으로 required = true를 갖기 때문에 ?name=을 필수로 보내줘야한다.
    public String getResponse1(@RequestParam(value="name")String n, Model model){
        model.addAttribute("name",n);
        return "response";
    }
    @GetMapping("/get/response2")
    public String getResponse2(@RequestParam(value="name",required = false)String n, Model model){
        model.addAttribute("name",n);
        return "response";
    }
    @GetMapping("get/response3/{name}/{age}")
    public String getResponse3(@PathVariable String name,@PathVariable("age")String abc, Model model){
        model.addAttribute("name",name);
        model.addAttribute("age",abc);
        return "response";
    }
    @GetMapping({"get/response4/{name}","get/response4/{name}/{age}"})
    //PathVariable도 @RequestParam과 동일하게 required의 기본값이 true
    public String getResponse4(@PathVariable String name,@PathVariable(required = false) String age, Model model){
        model.addAttribute("name",name);
        model.addAttribute("age",age);
        return "response";
    }


    @GetMapping("introduce/{name}")
    public String Introduce(@PathVariable String name,Model model){
        model.addAttribute("name",name);
        return "response";

    }
    @GetMapping("introduce2/{name}/{age}")
    public String Introduce2(@RequestParam ("name")String name,@RequestParam ("age"
    )String age,Model model){
        model.addAttribute("name","이우종");
        model.addAttribute("age","25");
        return "response";

    }

    @PostMapping("/post/response1")
    public String postResponse1(@RequestParam String name,Model model){
        model.addAttribute("name",name);
        //@RequestBody: 전달받은 body데이터를 json 형태의 객체로 만들어준다.
        return "response";
    }
    @PostMapping("/post/response2")
    public String postResponse2(@RequestParam(required = false) String name,Model model){
        model.addAttribute("name",name);
        //@RequestBody: 전달받은 body데이터를 json 형태의 객체로 만들어준다.
        return "response";
    }

    @PostMapping("/post/response3")
    @ResponseBody
    //@ResponseBody: response 데이터를 전달한다. //res.send
    public String postResponse3(@RequestParam String name,Model model){
        model.addAttribute("name",name);
        //@RequestBody: 전달받은 body데이터를 json 형태의 객체로 만들어준다.
        return "response";
    }
    @PostMapping("/post/prac1")
    public String postPrac1(@RequestParam(required = false) String name,@RequestParam(required = false) String gender,@RequestParam(required = false) String date,@RequestParam(required = false) String h,Model model){
        model.addAttribute("name",name);
        model.addAttribute("gender",gender);
        model.addAttribute("date",date);
        model.addAttribute("h",h);
        //@RequestBody: 전달받은 body데이터를 json 형태의 객체로 만들어준다.
        return "PostPrac1";
    }

    @PostMapping("/dto/response1")
    @ResponseBody
    public String dtoResponse(@ModelAttribute UserDTO userDTO){
        //DTO 앞에 어노테이션을 붙이지 않았으면 ->@ModelAttribute가 자동으로 실행된다
        //아무것도 넣지 않던 = @ModelAttribute
        //@ModelAttribute: html 폼 데이터를 컨트롤러로 전달할 때 객체에 매핑해주는 친구
        //매핑 -> 같은 이름끼리 set함수를 실행한다.
        // ->프론트에서 {name, abc}
        //@RequestBody
        String msg = userDTO.getName()+" "+userDTO.getAge();
        return msg;
    }
    @GetMapping("/dto/response11")
    @ResponseBody
    public String dtoResponse1(@RequestBody UserDTO userDTO){
        //Get 방식으로 전달하고 @RequestBody로 받으면 오류
        //@RequestBody : 요청의 본문에 있는 데이터 (body)
        String msg = userDTO.getName()+" "+userDTO.getAge();
        return "";
    }
    //일반 폼 전송 - DTO
    // 1) 아무것도 적지 않고 DTO로 받으면 -> o
    // 2) @ModelAttribute DTO로 받으면 -> o
    // 3) @RequestBody DTO로 받으면 -> 오류

    // @RequestBody는 요청의 본문에 있는 데이터9body)를 받아서 객체에 메핑
    // 단, 전달받은 요청의 데이터 형식이 json 또는 xml일 때만 실행이 가능
    // 일반 폼 전송 -> www-x-form-urlencoded

    @GetMapping("/vo/response1")
    @ResponseBody
    public String voResponse1( UserVO userVO){
        //@ModelAttribute를 이용하면 객체의 set함수를 이용해 값을 넣어준다.
        String msg = userVO.getName()+" "+userVO.getAge();
        return msg;
    }

    @PostMapping("/vo/response2")
    @ResponseBody
    public String voResponse2( UserVO userVO){
        String msg = userVO.getName()+" "+userVO.getAge();
        return msg;
    }

    @GetMapping("/axios/response1")
    @ResponseBody
    public String axiosResponse1(@RequestParam String name, @RequestParam String age){
        String msg = "이름: "+name+" , 나이 : "+age;
        return msg;
    }

    @GetMapping("/axios/response2")
    @ResponseBody
    public String axiosResponse2(UserDTO userDTO){
        String msg = "이름: "+userDTO.getName()+" , 나이 : "+userDTO.getAge();
        return msg;
    }

    //ModelAttribute 와 @RequestParam의 특징
    //일반 폼 전송 -> 파라미터 형태로 들어옴
    //json으로 값을 보내면 파라미터x 데이터 o
    @PostMapping("/axios/response3")
    @ResponseBody
    public String axiosResponse3(@RequestParam String name, @RequestParam String age){
        // axios post는 @RequsetParam으로 못 받는다
        String msg = "이름: "+name+" , 나이 : "+age;
        return msg;
    }

    @PostMapping("/axios/response4")
    @ResponseBody
    public String axiosResponse4(UserDTO userDTO){
        String msg = "이름: "+userDTO.getName()+" , 나이 : "+userDTO.getAge();
        return msg;
    }

    @PostMapping("/axios/response5")
    @ResponseBody
    public String axiosResponse5(@RequestBody UserDTO userDTO){
        String msg = "이름: "+userDTO.getName()+" , 나이 : "+userDTO.getAge();
        return msg;
    }

    @GetMapping("/axios/vo/response1")
    @ResponseBody
    public String axiosVOResponse1(@RequestParam String name, @RequestParam String age){
        //@ModelAttribute를 이용하면 객체의 set함수를 이용해 값을 넣어준다.
        String msg = name+" "+age;
        return msg;
    }

    @GetMapping("/axios/vo/response2")
    @ResponseBody
    public String axiosVOResponse2(UserVO userVO){
        String msg = "이름: "+userVO.getName()+" , 나이 : "+userVO.getAge();
        return msg;
    }

    @PostMapping("/axios/vo/response3")
    @ResponseBody
    public String axiosVOResponse3(@RequestParam String name, @RequestParam String age){
        //@ModelAttribute를 이용하면 객체의 set함수를 이용해 값을 넣어준다.
        String msg = name+" "+age;
        return msg;
    }
    @PostMapping("/axios/vo/response4")
    @ResponseBody
    public String axiosVOResponse4(UserVO userVO){
        String msg = "이름: "+userVO.getName()+" , 나이 : "+userVO.getAge();
        return msg;
    }

    @PostMapping("/axios/vo/response5")
    @ResponseBody
    public String axiosVOResponse5(@RequestBody UserVO userVO){
        //ModelAttribute는 setter 함수를 실행해 값을 넣어주는 친구
        //RequestBody는 setter 함수가 아닌 각각의 필드에 직접적으로 값을 주입하면서 매핑
        String msg = "이름: "+userVO.getName()+" , 나이 : "+userVO.getAge();
        return msg;
    }
    @PostMapping("/axios/prac1")
    @ResponseBody
    public String VOPrac1(@RequestBody UserInfo userInfo){
        String msg = userInfo.getName()+"회원가입 성공";
        return msg;
    }

}
