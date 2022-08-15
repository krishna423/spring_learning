package differenceComponentScanVSAnnotationConfig.F_AnnotationOnly_WithOut_ComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {

    public static void main(String[] args) {

        //Reference : https://howtodoinjava.com/spring-mvc/spring-mvc-difference-between-contextannotation-config-vs-contextcomponent-scan/

        ApplicationContext applicationContext = new AnnotationConfigApplicationContext(AppConfig.class);
        A a= applicationContext.getBean("a", A.class);
        a.toStringCheck();
        System.out.println(" with function  get Bean A : ");
        A a1= applicationContext.getBean("getABean", A.class);
        a1.toStringCheck();

//        B b1= applicationContext.getBean("b", B.class);
//        System.out.println(b1.hashCode());
//
//        B b2= applicationContext.getBean("getBeanZ", B.class);
//        System.out.println(b2.hashCode());

    }
}
