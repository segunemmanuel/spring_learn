package com.segz.learn.springframework.game;

public class GameRunner {
    private GamingConsole superGame;
    public  GameRunner(GamingConsole superGame){
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
