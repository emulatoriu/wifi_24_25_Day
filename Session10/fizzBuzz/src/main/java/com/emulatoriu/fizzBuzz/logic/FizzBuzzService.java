package com.emulatoriu.fizzBuzz.logic;

import com.emulatoriu.fizzBuzz.logic.checker.Checker;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.IntStream;

@Service
public class FizzBuzzService {
    private final List<Checker> checkers;

    public FizzBuzzService(List<Checker> checkers) {
        this.checkers = checkers;
    }

    public void printFizzBuzzSequence(int limit) {
        IntStream.range(0, limit)
                .forEach(i -> checkers.stream()
                        .forEach(checker -> {
                            if (checker.check(i)) {
                                System.out.println(checker.getAlias());
                                return;
                            }
                            System.out.println(i);
                        }));
        //same as:
//        for(int i=0; i<limit; i++) {
//            for(Checker checker : checkers) {
//                if (checker.check(i)) {
//                    System.out.println(checker.getAlias());
//                    return;
//                }
//                System.out.println(i);
//            }
//        }
        
    }


}
