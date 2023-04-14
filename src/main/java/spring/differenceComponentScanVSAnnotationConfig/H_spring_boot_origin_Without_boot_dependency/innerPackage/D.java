package spring.differenceComponentScanVSAnnotationConfig.H_spring_boot_origin_Without_boot_dependency.innerPackage;

import org.springframework.stereotype.Component;

public class D {

    public D(){
        System.out.println("Creating bean BeanD");
    }

    @Override
    public String toString() {
        return "in bean D";
    }
}
