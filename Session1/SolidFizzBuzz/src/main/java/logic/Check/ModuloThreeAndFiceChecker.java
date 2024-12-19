package logic.Check;

public class ModuloThreeAndFiceChecker implements Checker{
    @Override
    public boolean check(int number) {
        return number % 3 == 0 && number % 5 == 0;
    }

    @Override
    public String getKeyWord() {
        return "FizzBuzz";
    }
}
