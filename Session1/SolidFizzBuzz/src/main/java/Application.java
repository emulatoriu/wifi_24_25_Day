import logic.Check.Checker;
import logic.Check.ModuloFiveChecker;
import logic.Check.ModuloThreeAndFiceChecker;
import logic.Check.ModuloThreeChecker;

public class Application {
    public static void main(String[] args) {
        Checker checkers[] = {new ModuloThreeAndFiceChecker(),
                new ModuloFiveChecker(), new ModuloThreeChecker()};
        FizzBuzzService fizzBuzzService = new FizzBuzzService(checkers);
        fizzBuzzService.executeFizzBuzz(100);
    }
}
