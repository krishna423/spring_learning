package springBoot.beanScope;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

@SpringBootApplication
public class TestSpringBootRun {

    public static void main(String[] args) {
        ApplicationContext context = SpringApplication.run(TestSpringBootRun.class);
//        A a = context.getBean(A.class);
//        A a1 = context.getBean(A.class);

        B b = context.getBean(B.class);
        B b1 = context.getBean(B.class);


    //    System.out.println( "A class singleton bean " + a.hashCode() + "    " +a1.hashCode());
    //    System.out.println( "B class prototype bean " + b.hashCode() + "    " +b1.hashCode());
    }
}
