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
    public ResponseEntity test() {
        return ResponseEntity.ok("ok");
    }
}
