package dependencyInjectionConfigurationbased;

import dependencyInjection.Car;
import dependencyInjection.Vehicle;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung samsung = context.getBean(Samsung.class);
        samsung.config();



    }



}
