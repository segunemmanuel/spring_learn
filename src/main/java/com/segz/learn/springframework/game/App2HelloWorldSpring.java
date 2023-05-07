package com.segz.learn.springframework.game;

import com.segz.learn.springframework.HelloWorldConfiguration;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class App2HelloWorldSpring {
    public static void main(String[] args) {
 var context=
         new AnnotationConfigApplicationContext(HelloWorldConfiguration.class);



    }


}
