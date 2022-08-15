package differenceComponentScanVSAnnotationConfig;

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
