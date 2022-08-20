package spring.differenceComponentScanVSAnnotationConfig.A_WithXMLOnly;

public class B {

    public B(){
        System.out.println("Creating bean BeanB");
    }

    @Override
    public String toString() {
        return " in bean B ";
    }
}
