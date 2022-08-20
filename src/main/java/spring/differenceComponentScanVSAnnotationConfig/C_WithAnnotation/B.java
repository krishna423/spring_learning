package spring.differenceComponentScanVSAnnotationConfig.C_WithAnnotation;

import org.springframework.stereotype.Component;

@Component
public class B {

    public B(){
        System.out.println("Creating bean BeanB");
    }

    @Override
    public String toString() {
        return " in bean B ";
    }
}
