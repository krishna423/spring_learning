package differenceComponentScanVSAnnotationConfig.I_spring_boot_impl_with_boot_dependency.innerPackage;

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
        //System.out.println("In bean A : " + this.b +"  " + this.getBeanZ  +" "+ this.c);
        System.out.println("In bean A :- hashcode of A: " + this.hashCode() +  " hashcode of B: " +this.b.hashCode() + " hashcode of C:" + this.c.hashCode());
    }

}
