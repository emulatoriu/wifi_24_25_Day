package com.emulatoriu.HelloWorld.logic;

import org.springframework.stereotype.Component;

@Component
public class HelloWorldService {
    private final HelloService helloService;
    private final WorldService worldService;

    public HelloWorldService(HelloService helloService, WorldService worldService) {
        this.helloService = helloService;
        this.worldService = worldService;
    }


    public String getHelloWorld() {
        return "%s %s"
                .formatted(helloService.getHello(), worldService.getWorld());
    }
}
