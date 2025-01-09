package logic;

import java.util.List;
import java.util.function.Predicate;

public class ApplicationRunner {
    private final List<Predicate<Integer>> checker;

    public ApplicationRunner(List<Predicate<Integer>> checker) {
        this.checker = checker;
    }

    public void run(int number) {
        for(int i=0; i <= number; i++) {
            boolean found = false;
            checker.forEach(c ->);
            for(Predicate<Integer> c : checker) {
                if(c.test(i)) {
                    System.out.println(c.getClass().getName());
                    found = true;
                    break;
                }
            }
            if(!found) System.out.println(i);
        }
    }
}
