package differenceComponentScanVSAnnotationConfig.E_XML_ComponentScan;

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
