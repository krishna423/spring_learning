package differenceComponentScanVSAnnotationConfig.I_spring_boot_impl_with_boot_dependency.innerPackage;

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
