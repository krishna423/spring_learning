package differenceComponentScanVSAnnotationConfig.F_AnnotationOnly_WithOut_ComponentScan;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    //Function name doesn't matter here
    // but return type matters a lot

    @Bean
    public B getBeanZ(){
        return new B();
    }

    @Bean
    public C getCBean(){
        return new C();
    }

    @Bean
    public A getABean(){
        return new A();
    }

    @Bean(name = "b")
    public B getBX(){
        return new B();
    }

    @Bean(name = "c")
    public C getCBeanX(){
        return new C();
    }

    @Bean(name = "a")
    public A getABeanX(){
        return new A();
    }

 }
