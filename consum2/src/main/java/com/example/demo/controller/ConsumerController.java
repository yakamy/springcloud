package com.example.demo.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author yakamy
 *         2017-05-18 16:52
 */
@RestController
public class ConsumerController {
    @Autowired
    HelloRemore helloRemore;

    @RequestMapping("/hello/{name}")
    public String index(@PathVariable("name") String name) {
        return helloRemore.hello2(name);
    }
}
