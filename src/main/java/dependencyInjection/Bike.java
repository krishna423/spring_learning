package dependencyInjection;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

    @Autowired
    private Tyre tyre;

    public void setTyre(Tyre tyre) {
        this.tyre = tyre;
    }

    @Override
    public void drive(){
        System.out.println("Bike is moving.... "+ tyre);
    }

}
