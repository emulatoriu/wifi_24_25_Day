import logic.Check.*;

public class Application {
    public static void main(String[] args) {
        Checker[] checkers = {
                new ModuloThreeAndFiveChecker(),
                new ModuloFiveChecker(), new ModuloThreeChecker(),
                new ModuloSevenChecker()
        };

        FizzBuzzService fizzBuzzService = new FizzBuzzService(checkers);
        fizzBuzzService.executeFizzBuzz(105);
    }
}
