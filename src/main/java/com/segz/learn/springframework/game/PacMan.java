package com.segz.learn.springframework.game;

import org.springframework.stereotype.Component;

@Component
public class PacMan implements  GamingConsole{

    public void up()
    {
        System.out.println("jump");
    }
    public  void down()
    {
        System.out.println("Go into a hole");
    }

    public void left(){
        System.out.println("go left");
    }

    public void right()
    {
        System.out.println("go right");
    }

}
