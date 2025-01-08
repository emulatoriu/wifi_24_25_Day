import logic.Check.Checker;

public class FizzBuzzService {
    private final Checker checkers[];

    public FizzBuzzService(Checker[] checkers) {
        this.checkers = checkers;
    }

    public void executeFizzBuzz(int limit) {
        for(int i=1; i<= limit; i++) {
            boolean found = foundFizzBuzz(i);
            if(!found) System.out.println(i);
        }
    }

    private boolean foundFizzBuzz(int number) {
        for(Checker checker : checkers) {
            if (checker.check(number)) {
                System.out.println(checker.getKeyWord());
                return true;
            }
        }
        return false;
    }
}
