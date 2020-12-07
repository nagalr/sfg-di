package guru.springframework.sfgdi.controllers;

import org.springframework.stereotype.Controller;

/**
 * Created by ronnen on 2020-12-07.
 */

@Controller
public class MyController {

    public String sayHello() {
        System.out.println("Hello world");
        return "Hi Folks";
    }
}
