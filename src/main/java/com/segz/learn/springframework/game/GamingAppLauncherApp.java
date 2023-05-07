package com.segz.learn.springframework.game;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan("com.segz.learn.springframework.game")
    public class GamingAppLauncherApp {
    public static void main(String[] args) {
        try (var context = new
                AnnotationConfigApplicationContext(GamingAppLauncherApp.class)) {
            context.getBean(GamingConsole.class).up();
            context.getBean(GamingConsole.class).left();
            context.getBean(GamingConsole.class).right();
            context.getBean(GamingConsole.class).down();
        }
    }
}
