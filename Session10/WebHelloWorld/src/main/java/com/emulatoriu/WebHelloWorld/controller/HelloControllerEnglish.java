package com.emulatoriu.WebHelloWorld.controller;

import com.emulatoriu.WebHelloWorld.logic.HelloService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("english")
public class HelloControllerEnglish {
    private final HelloService helloService;

    public HelloControllerEnglish(HelloService helloService) {
        this.helloService = helloService;
    }

    @GetMapping
    String sayHello() {
        return helloService.getHello();
    }
}
