package spring.differenceComponentScanVSAnnotationConfig.F_AnnotationOnly_WithOut_ComponentScan;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class A {

    @Autowired
    private B b;

    @Autowired
    private B getBeanZ;

    @Autowired
    private C c;

    public A(){
        System.out.println("Creating bean BeanA");
    }


    public void toStringCheck(){
        //System.out.println("In bean A : " + this.b +"  " + this.getBeanZ  +" "+ this.c);
        System.out.println("In bean A :- hashcode of A: " + this.hashCode() +  " hashcode of B: " +this.b.hashCode() +" hashcode of BeanZ:" + this.getBeanZ.hashCode()+ " hashcode of C:" + this.c.hashCode());
    }

}
