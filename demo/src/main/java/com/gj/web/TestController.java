package com.gj.web;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Gjing
 **/
@RestController
public class TestController {

    @GetMapping("/test")
    public ResponseEntity test() throws InterruptedException {
        Thread.sleep(3000);
        return ResponseEntity.ok("ok");
    }
}
