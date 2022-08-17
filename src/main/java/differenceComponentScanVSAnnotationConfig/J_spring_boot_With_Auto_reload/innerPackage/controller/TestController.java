package differenceComponentScanVSAnnotationConfig.J_spring_boot_With_Auto_reload.innerPackage.controller;

import differenceComponentScanVSAnnotationConfig.J_spring_boot_With_Auto_reload.innerPackage.enums.Action;
import differenceComponentScanVSAnnotationConfig.J_spring_boot_With_Auto_reload.innerPackage.service.TestService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

@Controller
public class TestController {

    @Autowired
    private TestService testService;


    @GetMapping(value = "/sum")
    @ResponseBody
    public String fun(@RequestParam(name="action")Action action){
//        int a=2;
//        int b=3;
//        int sum = a+b;
//        System.out.println(" sum is  : "+ sum);
//        return "sum is adding changes : "+ sum ;
        return testService.fun(action);
    }

}
