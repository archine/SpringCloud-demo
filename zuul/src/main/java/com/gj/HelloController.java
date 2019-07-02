package com.gj;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gjing
 **/
@RestController
public class HelloController {

    @GetMapping("/test/hello")
    public String test() {
        return "hello zuul";
    }

}
