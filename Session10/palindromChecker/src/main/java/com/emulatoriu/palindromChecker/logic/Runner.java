package com.emulatoriu.palindromChecker.logic;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class Runner implements ApplicationRunner {
    private final PalindromChecker palindromChecker;
    private final UserInputService userInputService;

    public Runner(PalindromChecker palindromChecker, UserInputService userInputService) {
        this.palindromChecker = palindromChecker;
        this.userInputService = userInputService;
    }

    @Override
    public void run(ApplicationArguments args) throws Exception {
        String userInput = userInputService.getUserInput();
        boolean isPalindrom = palindromChecker.isWordPalindrom(userInput);
        String isPalindromText = isPalindrom ? "is a palindrom" : "is not a palindrom";
        System.out.println("%s %s".formatted(userInput,
                isPalindromText));

    }
}
