package spring.differenceComponentScanVSAnnotationConfig.H_spring_boot_origin_Without_boot_dependency.innerPackage;

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
