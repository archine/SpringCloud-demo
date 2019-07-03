package com.gj.web;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gjing
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    public Map<String,Object> test() {
        Map<String,Object> map = new HashMap<>(16);
        map.put("code", "ok");
        return map;
    }

    @GetMapping("/test4")
    public String test2(@RequestParam(name = "param1") String param1) {
        return param1;
    }

    @PostMapping("/test3")
    public Integer test3(Integer id) {
        return id;
    }

    @GetMapping("/test2")
    public String test2() {
        return "ok";
    }
}
