package spring.differenceComponentScanVSAnnotationConfig.D_WithAnnotationAndXML;


import org.springframework.beans.factory.annotation.Autowired;

public class A {

    @Autowired
    private B b;
    @Autowired
    private C c;

    public A(){
        System.out.println("Creating bean BeanA");
    }

    public void setB(B b){
        this.b = b;
        System.out.println("Setting bean reference for beanB");
    }

    public void setC(C c){
        this.c = c;
        System.out.println("Setting bean reference for beanC");
    }


    public void toStringCheck(){
        System.out.println("In bean A : " + this.b + "  " + this.c);
    }

}
