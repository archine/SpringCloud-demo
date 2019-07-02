package com.gj.test;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * @author Gjing
 **/
@RestController
public class FeignController {

    @Resource
    private FeignService feignService;

    @GetMapping("/testFeign")
    public String testFeign() {
        return feignService.test2();
    }
}
