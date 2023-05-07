package com.segz.learn.springframework.game;
import com.segz.learn.springframework.game.GameRunner;
import com.segz.learn.springframework.game.MarioGame;
import com.segz.learn.springframework.game.PacMan;
import com.segz.learn.springframework.game.SuperGame;

public class App1GamingBasic {

    public static void main(String[] args) {
        var superContraGame = new SuperGame();
        var marioGame= new MarioGame();
        var pacMan = new PacMan();
        var gameRunner2= new GameRunner(marioGame);
        /* object creation and dependency injetcion */
        gameRunner2.run1();

    }
}
