package differenceComponentScanVSAnnotationConfig.E_XML_ComponentScan;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Test {

    public static void main(String[] args) {

        //Reference : https://howtodoinjava.com/spring-mvc/spring-mvc-difference-between-contextannotation-config-vs-contextcomponent-scan/

        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("differenceComponentScanVSAnnotationConfig.xml");
        A a= applicationContext.getBean("a",A.class);
        a.toStringCheck();

    }
}
