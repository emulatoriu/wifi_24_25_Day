package com.emulatoriu.fizzBuzz.logic;

import org.springframework.stereotype.Service;

import java.util.Scanner;

@Service
public class UserInputService {
    private final Scanner scanner;

    public UserInputService(Scanner scanner) {
        this.scanner = scanner;
    }

    private String getUserInput() {
        return scanner.nextLine();
    }

    public int getFizzBuzzMaxNumber() {
        try {
            int limit = Integer.parseInt(getUserInput());
            return limit;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            throw new RuntimeException();
        }

    }
}
