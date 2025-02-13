package com.emulatoriu.fizzBuzz.logic.checker;

public class ModuloFiveChecker implements Checker{
    @Override
    public boolean check(int number) {
        return number % 5 == 0;
    }

    @Override
    public String getAlias() {
        return "Buzz";
    }
}
