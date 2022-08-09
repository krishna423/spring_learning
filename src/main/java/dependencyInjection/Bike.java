package dependencyInjection;


import org.springframework.stereotype.Component;

@Component
public class Bike implements Vehicle{

    @Override
    public void drive(){
        System.out.println("Bike is moving....");
    }

}
