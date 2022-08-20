package spring.differenceComponentScanVSAnnotationConfig.G_AnnotationOnly_With_ComponentScan;

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
