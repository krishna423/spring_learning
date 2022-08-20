package spring.differenceComponentScanVSAnnotationConfig.A_WithXMLOnly;


public class A {

    private B b;
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
