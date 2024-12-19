package logic.Check;

public class ModuloThreeChecker implements Checker {
    @Override
    public boolean check(int number) {
        return number % 3 == 0;
    }

    @Override
    public String getKeyWord() {
        return "Fizz";
    }
}
