package com.segz.learn.springframework.helloWorld;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

record Person(String name,int age,Address address){
};
record Address(String firstLine, String city){};


@Configuration
public class HelloWorldConfiguration {

    @Bean
    public String name(){
        return "Segun Adeyemi";
    }

    @Bean
    public int age(){
        return 7;
    }


    @Bean
    public Person person(){
        var person = new Person("Ravi",22,new Address("baker","londiod"));
        return person;
    }

    @Bean
    public Person person2MethodCall(){
        return new Person(name(),age(),address());
    }

    @Bean
    public Person person3Parameters(String name,int age,Address address3){
        return new Person(name, age, address3());
    }

    @Bean(name="address2")
    public Address address(){
        return new Address("Baker street","london");

    }
    @Bean(name="address3")
    public Address address3(){
        return new Address("Baker streets","londons");
    }
}
