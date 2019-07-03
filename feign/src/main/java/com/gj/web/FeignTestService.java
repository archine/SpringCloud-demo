package com.gj.web;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

import java.util.Map;

/**
 * @author Gjing
 **/
@FeignClient(name = "demo",fallback = FeignTestFallbackImpl.class)
public interface FeignTestService {

    @RequestMapping(value = "/test", method = RequestMethod.GET)
    Map<String,Object> test();

    @RequestMapping(value = "test4", method = RequestMethod.GET)
    String test2(@RequestParam("param1") String param1);

    @RequestMapping(value = "/test3", method = RequestMethod.POST)
    Integer test3(@RequestParam("id") Integer id);
}
