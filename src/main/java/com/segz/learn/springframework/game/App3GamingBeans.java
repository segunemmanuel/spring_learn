package com.segz.learn.springframework.game;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App3GamingBeans {
    public static void main(String[] args) {

        try (var context = new
                AnnotationConfigApplicationContext(GamingConfiguration.class)) {

            context.getBean(GamingConsole.class).up();
            context.getBean(GamingConsole.class).left();
            context.getBean(GamingConsole.class).right();
            context.getBean(GamingConsole.class).down();

        }

    }


}
