package com.gj.test;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

/**
 * @author Gjing
 **/
@FeignClient(value = "demo",fallback = FeignServiceFallbackImpl.class)
public interface FeignService {
    @RequestMapping(value = "/test2", method = RequestMethod.GET)
    String test2();
}

/**
 * 回退类，实现feignService
 */
@Component
class FeignServiceFallbackImpl implements FeignService{
    @Override
    public String test2() {
        return "啊哦，出错了";
    }
}
