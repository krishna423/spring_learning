package LiteBeanTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Configuration
@ComponentScan
public class LiteBeanTest {

    @Bean
    public A getA(){
        System.out.println("entering in a");
        getB();
        System.out.println("executing a");
        A a = new A();
        System.out.println(a);
        System.out.println("again calling B");
        getB();
        return a;
    }

    @Bean
    public B getB(){
        System.out.println("entering in b");
        B b = new B();
        System.out.println(b);
        return b;
    }

}
