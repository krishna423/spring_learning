package dependencyInjection;

import org.springframework.stereotype.Component;

@Component
public class Car implements Vehicle{

    private Tyre tyre;

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public void drive(){
        System.out.println("Car is moving.... " + tyre);
    }
}
