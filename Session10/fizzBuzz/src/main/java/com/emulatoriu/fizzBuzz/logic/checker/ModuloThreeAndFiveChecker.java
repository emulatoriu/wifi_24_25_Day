package com.emulatoriu.fizzBuzz.logic.checker;

public class ModuloThreeAndFiveChecker implements Checker {
    @Override
    public boolean check(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    @Override
    public String getAlias() {
        return "FizzBuzz";
    }
}
