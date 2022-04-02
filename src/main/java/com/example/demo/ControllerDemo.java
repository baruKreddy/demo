package com.example.demo;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ControllerDemo {

    @GetMapping(value = "/handsOn", produces = "application/json")
    public Name handsOn(){
        return new Name("/handsOn");
    }

}
