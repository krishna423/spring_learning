package spring.differenceComponentScanVSAnnotationConfig.A_WithXMLOnly;

public class C {

    public C(){
        System.out.println("Creating bean BeanC");
    }

    @Override
    public String toString() {
        return "in bean C";
    }
}
