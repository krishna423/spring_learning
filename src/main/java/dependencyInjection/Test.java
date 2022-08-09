package dependencyInjection;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

//        //Without dependency injection
//        Vehicle vehicle = new Car();
//        vehicle.drive();

//        //With dependency injection -XML based
//        ApplicationContext context = new ClassPathXmlApplicationContext("spring.xml");
//        Vehicle vehicle1 = context.getBean("vehicle",Vehicle.class);
//        vehicle1.drive();

//        //With dependency injection -component scan xml
//        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
//        Vehicle vehicle2 = context1.getBean("bike",Vehicle.class);
//        vehicle2.drive();

        //With dependency injection - scan xml + property set
        ApplicationContext context1 = new ClassPathXmlApplicationContext("spring.xml");
//        Tyre t = context1.getBean("tyre",Tyre.class);
//        System.out.println(t);
        Vehicle vehicle2 = context1.getBean("car",Car.class);
        vehicle2.drive();



    }



}
