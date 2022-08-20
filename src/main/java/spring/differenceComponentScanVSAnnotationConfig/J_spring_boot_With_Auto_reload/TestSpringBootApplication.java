package spring.differenceComponentScanVSAnnotationConfig.J_spring_boot_With_Auto_reload;

import spring.differenceComponentScanVSAnnotationConfig.I_spring_boot_impl_with_boot_dependency.innerPackage.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

import java.util.List;


@SpringBootApplication
public class TestSpringBootApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(TestSpringBootApplication.class);
        String[] beanNames = context.getBeanDefinitionNames();
        for( String beanName : beanNames){
            System.out.println(beanName);
        }
    }

}
