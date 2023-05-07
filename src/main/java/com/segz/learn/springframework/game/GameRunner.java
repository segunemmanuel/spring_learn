package com.segz.learn.springframework.game;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component
public class GameRunner {
    private GamingConsole superGame;
    public  GameRunner(@Qualifier("SuperGameQualifier") GamingConsole superGame){
        this.superGame=superGame;
    }
    public void run() {
        System.out.println("Running game: " + superGame);
        superGame.up();
        superGame.down();
        superGame.left();
        superGame.right();
    }
    public void run1() {
        System.out.println("Running game: " + superGame);
        superGame.up();
        superGame.down();
        superGame.left();
        superGame.right();
    }

}
