package com.emulatoriu.fizzBuzz.configuration;

import com.emulatoriu.fizzBuzz.logic.checker.Checker;
import com.emulatoriu.fizzBuzz.logic.checker.ModuloFiveChecker;
import com.emulatoriu.fizzBuzz.logic.checker.ModuloThreeAndFiveChecker;
import com.emulatoriu.fizzBuzz.logic.checker.ModuloThreeChecker;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.util.List;

@Configuration
public class CheckerConfiguration {
    @Bean
    Checker moduloThreeChecker() {
        return new ModuloThreeChecker();
    }
    @Bean
    Checker moduloFiveChecker() {
        return new ModuloFiveChecker();
    }
    @Bean
    Checker moduloThreeAndFiveChecker() {
        return new ModuloThreeAndFiveChecker();
    }

    @Bean
    List<Checker> checkers() {
        return List.of(
          moduloThreeAndFiveChecker(),
          moduloThreeChecker(),
          moduloFiveChecker()
        );
//same:
//        return List.of(
//                new ModuloThreeAndFiveChecker(),
//                new ModuloThreeChecker(),
//                new ModuloFiveChecker()
//        );
    }
}
