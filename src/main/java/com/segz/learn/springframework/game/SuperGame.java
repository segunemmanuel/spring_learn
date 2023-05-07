package com.segz.learn.springframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
@Qualifier("SuperGameQualifier")
public class SuperGame implements  GamingConsole {
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
