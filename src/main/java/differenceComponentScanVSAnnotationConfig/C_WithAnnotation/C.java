package differenceComponentScanVSAnnotationConfig.C_WithAnnotation;

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
