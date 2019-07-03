package com.gj.web;

import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.Map;

/**
 * @author Gjing
 **/
@Component
public class FeignTestFallbackImpl implements FeignTestService {
    @Override
    public Map<String, Object> test() {
        // TODO: 2019/7/3 这里就实现回退后的处理咯
        Map<String,Object> map = new HashMap<>(16);
        map.put("code", "回退了");
        return map;
    }

    @Override
    public String test2(String param1) {
        return null;
    }

    @Override
    public Integer test3(Integer id) {
        return null;
    }
}
