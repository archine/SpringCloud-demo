package com.gj.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Gjing
 **/
@RestController
public class FeignTestController {

    @Resource
    private FeignTestService feignTestService;

    @GetMapping("/test")
    public String test() {
        return feignTestService.test().toString();
    }

    @GetMapping("/test2")
    public ResponseEntity test2() {
        String test2 = feignTestService.test2("你好");
        return ResponseEntity.ok(test2);
    }

    @GetMapping("/test3")
    public ResponseEntity test3() {
        Integer test3 = feignTestService.test3(1);
        return ResponseEntity.ok(test3);
    }
}
