package dependencyInjectionConfigurationBased;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "dependencyInjectionConfigurationBased")
public class AppConfig {

//    @Bean
//    public Samsung getRandomName(){
//        return new Samsung();
//    }
//
//    @Bean
//    public MobileProcessor getRandomNameFun(){
//        return new SnapDragon();
//    }
}
