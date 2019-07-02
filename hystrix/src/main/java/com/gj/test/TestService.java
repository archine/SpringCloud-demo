package com.gj.test;

/**
 * @author Gjing
 **/

import cn.gjing.HttpClient;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.stereotype.Service;

@Service
public class TestService {

    @HystrixCommand(fallbackMethod = "defaultFallback")
    String hello() {
        HttpClient httpClient = new HttpClient();
        return httpClient.get("http://127.0.0.1:8090/test", String.class);
    }

    public String defaultFallback() {
        return "no hello";
    }
}
