package com.emulatoriu.WebHelloWorld.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("deutsch")
public class HelloControllerDeutsch {
    @GetMapping
    @RequestMapping("hi")
    String sayHello() {
        return "Servus";
    }

    @GetMapping
    @RequestMapping("bye")
    String sayBye() {
        return "Auf wiedersehen";
    }
}
