package com.segz.learn.springframework.a1;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import java.util.Arrays;

@Component
class YourBusinessClass {
    Dependency dependency;
    Dependency2 dependency2;
    @Autowired
    public void setDependency2(Dependency2 dependency2) {
        this.dependency2 = dependency2;
        System.out.println("Setter Injection-setDependency2");
    }

    @Autowired
    public void setDependency(Dependency dependency) {
        this.dependency = dependency;
        System.out.println("Setter Injection-setDependency");

    }

    public String toString()
    {
     return "dependency1" + dependency2 + dependency;

    }


}
@Component

class Dependency{}
@Component

class Dependency2{}


@Configuration
@ComponentScan("com.segz.learn.springframework.a1")
public class DependencyJavaSpring {
    public static void main(String[] args) {
        try (var context = new
                AnnotationConfigApplicationContext(DependencyJavaSpring.class)) {
            Arrays.stream(context.getBeanDefinitionNames())
                    .forEach(System.out::println);

            System.out.println(context.getBean(YourBusinessClass.class));
        }
    }

}
