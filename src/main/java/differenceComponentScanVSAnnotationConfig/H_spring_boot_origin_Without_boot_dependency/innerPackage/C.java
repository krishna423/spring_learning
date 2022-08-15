package differenceComponentScanVSAnnotationConfig.H_spring_boot_origin_Without_boot_dependency.innerPackage;

import org.springframework.stereotype.Component;

@Component
public class C {

    public C(){
        System.out.println("Creating bean BeanC");
    }

    @Override
    public String toString() {
        return "in bean C";
    }
}
