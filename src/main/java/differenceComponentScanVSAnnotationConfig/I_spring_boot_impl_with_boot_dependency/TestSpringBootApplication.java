package differenceComponentScanVSAnnotationConfig.I_spring_boot_impl_with_boot_dependency;

import differenceComponentScanVSAnnotationConfig.I_spring_boot_impl_with_boot_dependency.innerPackage.A;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;


//@Configuration
//@ComponentScan
//@EnableAutoConfiguration
@SpringBootApplication
public class TestSpringBootApplication {

    public static void main(String[] args) {

        ApplicationContext context = SpringApplication.run(TestSpringBootApplication.class);
        //Why SpringApplication.run is used here
        //in order to provide some extra features like :
        // 1.profiling
        // 2.Auto configure for Log, Cache,JDBC,jpa,Kafka
        // 3. Spring boot listeners
        // Schedular config
        //MVC auto setup : no need to setup dispatcher servlet explicitly
        //

        A a =  context.getBean("a",A.class);
        a.toStringCheck();

        System.out.println("\n\n");
        String[] allBeanNames = context.getBeanDefinitionNames();
        System.out.println("no of beans created : "+allBeanNames.length);
        for(String beanName : allBeanNames) {
            System.out.println(beanName);
        }


    }

}
