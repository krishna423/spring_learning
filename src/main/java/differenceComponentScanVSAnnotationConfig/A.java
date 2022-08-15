package differenceComponentScanVSAnnotationConfig;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private B b;

    @Autowired
    private C c;

    public A(){
        System.out.println("Creating bean BeanA");
    }


    public void toStringCheck(){
        System.out.println("In bean A : " + this.b + "  " + this.c);
    }

}
