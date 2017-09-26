package com.thinkings.web;

import com.thinkings.config.CustomProperties;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {
    @Autowired
    private CustomProperties customProperties;

    @RequestMapping("/hello")
    public String index() {
        System.out.println("customProperties ----properties.attritbuteA----"
                + customProperties.getAttritbuteA());
        return "Hello World";
    }
}
