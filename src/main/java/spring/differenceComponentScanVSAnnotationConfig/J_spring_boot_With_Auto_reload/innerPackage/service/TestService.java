package spring.differenceComponentScanVSAnnotationConfig.J_spring_boot_With_Auto_reload.innerPackage.service;

import spring.differenceComponentScanVSAnnotationConfig.J_spring_boot_With_Auto_reload.innerPackage.enums.Action;
import org.springframework.stereotype.Service;

@Service
public class TestService {


    public String fun(Action action) {
        int a = 20;
        int b = 10;
        int result = -2;
        if(Action.ADDITION.equals(action)){
            result = a+b;
        }else if(Action.SUBTRACTION.equals(action)){
            result = a-b;
        } else if(Action.MULTIPLICATION.equals(action)){
            result = a*b;
        }
        else if(Action.DIVISION.equals(action)){
            result = a/b;
        }else{
            result =-1;
        }
        System.out.println(" sum is from service class : " + result);
        return "sum is adding changes : " + result;
    }
}
