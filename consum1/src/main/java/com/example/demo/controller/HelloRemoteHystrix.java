package com.example.demo.controller;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yakamy
 *         2017-05-18 17:20
 */
@Component
public class HelloRemoteHystrix implements HelloRemore {
    @Override
    public String hello(@RequestParam(value = "name") String name) {
        return "hello" + name + ", this messge send failed ";
    }
}
