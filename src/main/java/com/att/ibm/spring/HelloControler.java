package com.att.ibm.spring;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloControler {

    @GetMapping(path = "/hello-world")
    public String sayHello(){
        return "Hello World";
    }
}
