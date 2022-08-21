package springBoot.beanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.stereotype.Component;

@Component(ConfigurableBeanFactory.SCOPE_SINGLETON)
public class B {

    private int x;

    public B() {
        System.out.println("creating B");
    }


    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;

    }
}