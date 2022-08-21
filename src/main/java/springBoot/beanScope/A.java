package springBoot.beanScope;

import org.springframework.beans.factory.config.ConfigurableBeanFactory;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Component;

@Component
@Scope(value = ConfigurableBeanFactory.SCOPE_PROTOTYPE)
public class A {

    private int x;

    public A(){
        System.out.println("creating A");
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getX() {
        return x;
    }
}
