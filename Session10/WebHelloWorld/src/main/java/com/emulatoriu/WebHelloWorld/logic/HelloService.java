package com.emulatoriu.WebHelloWorld.logic;

import org.springframework.stereotype.Service;

@Service
public class HelloService {
    private final String hello = "Hello";

    public String getHello() {
        return hello;
    }
}
