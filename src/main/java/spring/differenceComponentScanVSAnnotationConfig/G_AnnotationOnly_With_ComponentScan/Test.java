package spring.differenceComponentScanVSAnnotationConfig.G_AnnotationOnly_With_ComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        //Reference : https://howtodoinjava.com/spring-mvc/spring-mvc-difference-between-contextannotation-config-vs-contextcomponent-scan/

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        A a= applicationContext.getBean("a", A.class);
        a.toStringCheck();


    }
}
