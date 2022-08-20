package spring.differenceComponentScanVSAnnotationConfig.H_spring_boot_origin_Without_boot_dependency;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import spring.differenceComponentScanVSAnnotationConfig.H_spring_boot_origin_Without_boot_dependency.innerPackage.A;


@Configuration
@ComponentScan
public class Test {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(Test.class);

        A a =  context.getBean("a",A.class);
        a.toStringCheck();

//        System.out.println("\n\n");
//        String[] allBeanNames = context.getBeanDefinitionNames();
//        System.out.println("no of beans created : "+allBeanNames.length);
//        for(String beanName : allBeanNames) {
//            System.out.println(beanName);
//        }


    }

}
