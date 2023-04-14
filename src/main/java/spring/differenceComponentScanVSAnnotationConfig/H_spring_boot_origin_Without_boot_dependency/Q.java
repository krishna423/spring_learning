package spring.differenceComponentScanVSAnnotationConfig.H_spring_boot_origin_Without_boot_dependency;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.stereotype.Component;
import spring.differenceComponentScanVSAnnotationConfig.H_spring_boot_origin_Without_boot_dependency.innerPackage.D;

@ComponentScan
public class Q {

    @Bean
    public D getDBeanTest(){
        return new D();
    }
}
