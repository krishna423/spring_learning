package dependencyInjectionConfigurationbased;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class AppConfig {

    @Bean
    public Samsung getRandomName(){
        return new Samsung();
    }

    @Bean
    public MobileProcessor getRandomNameFun(){
        return new SnapDragon();
    }
}
