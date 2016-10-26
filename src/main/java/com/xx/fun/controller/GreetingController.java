package com.xx.fun.controller;

import com.xx.fun.entity.Greeting;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.concurrent.atomic.AtomicLong;

/**
 *
 * Created by liu on 2016/10/26.
 */
@RestController
public class GreetingController {

    private static final String TEMPLATE = "hello, %s";

    private final AtomicLong counter = new AtomicLong();

    @RequestMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name){
        return new Greeting(counter.incrementAndGet(), String.format(TEMPLATE, name));
    }
}
