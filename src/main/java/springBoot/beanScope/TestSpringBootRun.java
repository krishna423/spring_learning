package springBoot.beanScope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestSpringBootRun {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TestSpringBootRun.class);
        A a = context.getBean(A.class);
        a.setX(10);
        A a1 = context.getBean(A.class);

        B b = context.getBean(B.class);
        b.setX(10);
        B b1 = context.getBean(B.class);


        System.out.println( "A class prototype bean " + a.hashCode() + "    " +a1.hashCode()+"  x: " + a1.getX());
        System.out.println( "B class singleton bean " + b.hashCode() + "    " +b1.hashCode()+ " x: "+ b1.getX());
    }
}
