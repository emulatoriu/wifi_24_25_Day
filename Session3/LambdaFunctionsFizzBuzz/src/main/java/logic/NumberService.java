package logic;

import java.util.List;

public class NumberService {
    public void printNumbers(List<Integer> numbers) {
        numbers.forEach(number -> System.out.println(number));
    }
}
