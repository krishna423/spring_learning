package dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

//        //Without dependency injection
//        Vehicle vehicle = new Car();
//        vehicle.drive();

        //With dependency injection
        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
        Vehicle vehicle1 = context.getBean("vehicle",Vehicle.class);
        vehicle1.drive();

    }



}
