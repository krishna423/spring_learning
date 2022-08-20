package spring.LiteBeanTest;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;

@Component
@ComponentScan
public class LiteBeanTest {



    @Bean
    public B getB(){
        System.out.println("entering in b");
        B b = new B();
        System.out.println(b);
        return b;
    }

}
