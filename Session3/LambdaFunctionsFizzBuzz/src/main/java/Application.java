import logic.ApplicationRunner;
import logic.Checker;

import java.util.List;
import java.util.function.Predicate;

public class Application {
    public static void main(String[] args) {
        Predicate<Integer> moduloThreeAndFiveChecker = (number) -> number % 3 == 0 && number % 5 == 0;
        Predicate<Integer> moduloThreeChecker = (number) -> number % 3 == 0;
        Predicate<Integer> moduloFiveChecker = (number) -> number % 5 == 0;

        List<Predicate<Integer>> checker = List.of(
                moduloThreeAndFiveChecker,
                moduloFiveChecker,
                moduloThreeChecker
        );

        ApplicationRunner applicationRunner = new ApplicationRunner(checker);
        applicationRunner.run(100);

    }
}
