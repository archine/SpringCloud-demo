package com.gj.web;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import javax.annotation.Resource;

/**
 * @author Gjing
 **/
@RestController
public class TestRibbonController {

    @Resource
    private RestTemplate restTemplate;

    @PostMapping("/test")
    public String test() {
        return restTemplate.getForObject("http://demo/test-ribbon", String.class);
    }
}
