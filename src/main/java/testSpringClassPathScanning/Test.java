package testSpringClassPathScanning;

import org.apache.log4j.spi.LoggerFactory;
import org.springframework.beans.factory.config.BeanDefinition;
import org.springframework.context.annotation.ClassPathScanningCandidateComponentProvider;

import java.util.Set;
import java.util.logging.Logger;


public class Test {

    public static void main(String[] args) {

        ClassPathScanningCandidateComponentProvider provider =
                new ClassPathScanningCandidateComponentProvider(true);
        //String basePackage = "LiteBeanTest";
        String basePackage = "dependencyInjectionConfigurationBased";
        Set<BeanDefinition> components = provider.findCandidateComponents(basePackage);
        for (BeanDefinition component : components) {
            System.out.printf("Component: %s\n", component.getBeanClassName());
        }
    }
}
