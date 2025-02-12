package com.emulatoriu.HelloWorld.logic;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {

    private HelloWorldService helloWorldService;

    public Runner(HelloWorldService helloWorldService) {
        this.helloWorldService = helloWorldService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.println(helloWorldService.getHelloWorld());
    }
}
