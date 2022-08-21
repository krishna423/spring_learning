package springBoot.beanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

import java.lang.module.Configuration;

@Component(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class B {

    public B(){
        System.out.println("creating B");
    }
}
