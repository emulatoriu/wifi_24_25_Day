package com.emulatoriu.fizzBuzz.logic.checker;

public class ModuloThreeChecker implements Checker{
    @Override
    public boolean check(int number) {
        return number % 3 == 0;
    }

    @Override
    public String getAlias() {
        return "Fizz";
    }
}
