package spring.LiteBeanTest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class LiteBeanTest2 {

    @Autowired
    LiteBeanTest liteBeanTest;

    @Bean
    public A getA(){
        System.out.println("entering in a");
        liteBeanTest.getB();
        System.out.println("executing a");
        A a = new A();
        System.out.println(a);
        System.out.println("again calling B");
        liteBeanTest.getB();
        return a;
    }
}
