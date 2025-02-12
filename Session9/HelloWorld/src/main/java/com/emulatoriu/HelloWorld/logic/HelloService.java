package com.emulatoriu.HelloWorld.logic;

import org.springframework.stereotype.Component;

@Component
public class HelloService {
    private final String hello = "Hello";

    public String getHello() {
        return hello;
    }
}
