package logic.Check;

public class ModuloFiveChecker implements Checker{
    @Override
    public boolean check(int number) {
        return number % 5 == 0;
    }

    @Override
    public String getKeyWord() {
        return "Buzz";
    }
}
