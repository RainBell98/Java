package com.example.kdt9Example.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.example.kdt9Example.game")
public class GameMain {
    public static void main(String[] args) {
       var context = new AnnotationConfigApplicationContext(GameMain.class);
        context.getBean(GameConsole.class).up();
        context.getBean(GameEngine.class).run();
       //결합도 : 무엇인가를 변경하는데 얼마나 많은 작업이 관련되어 있는지에 대한 측정
//       DiabloGame game = new DiabloGame();
//       LoLGame game2 = new LoLGame();
//       GameEngine engine = new GameEngine(game2);
//       engine.run();
    }
}
