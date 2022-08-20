package spring.dependencyInjectionConfigurationBased;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {


        ApplicationContext context = new AnnotationConfigApplicationContext(AppConfig.class);
        Samsung samsung = context.getBean(Samsung.class);
        samsung.config();



    }



}
