package com.emulatoriu.fizzBuzz.logic;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {
    private final UserInputService userInputService;
    private final FizzBuzzService fizzBuzzService;

    public Runner(UserInputService userInputService, FizzBuzzService fizzBuzzService) {
        this.userInputService = userInputService;
        this.fizzBuzzService = fizzBuzzService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        System.out.print("Please choose a limit: ");
        int limit = userInputService.getFizzBuzzMaxNumber();
        fizzBuzzService.printFizzBuzzSequence(limit);
    }
}
