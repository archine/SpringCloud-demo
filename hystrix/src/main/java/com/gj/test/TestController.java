package com.gj.test;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Gjing
 **/
@RestController
public class TestController {

    @Resource
    private TestService testService;

    @PostMapping("/test")
    public String test() {
        return testService.hello();
    }
}
