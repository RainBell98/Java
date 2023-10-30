package com.example.kdt9Example.game;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Component;

@Component
@Primary
public class LoLGame implements GameConsole{
    public void up(){
        System.out.println("LOL Up");
    }
    public void down(){
        System.out.println("LOL Back");
    }
    public void right(){
        System.out.println("LOL Right");
    }
    public void left(){
        System.out.println("LOL Left");
    }
}
