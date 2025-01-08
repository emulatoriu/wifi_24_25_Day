package logic.Check;

public class ModuloSevenChecker implements Checker{
    @Override
    public boolean check(int number) {
        return number % 7 == 0;
    }

    @Override
    public String getKeyWord() {
        return "Bizz";
    }
}
