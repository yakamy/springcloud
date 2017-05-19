package com.example.demo.controller;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

/**
 * @author yakamy
 *         2017-05-18 16:51
 */
@FeignClient(name = "spring-cloud-producer", fallback = HelloRemoteHystrix.class)
public interface HelloRemore {
    @RequestMapping(value = "/hello")
    public String hello(@RequestParam(value = "name") String name);
}
