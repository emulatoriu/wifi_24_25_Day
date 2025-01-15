package logic;

import java.util.List;
import java.util.Random;

public class RandomService {
    private final Random random;

    public RandomService(Random random) {
        this.random = random;
    }

    private int getRandomNumber(int fromIncluded, int toExcluded) {
        return random.nextInt(fromIncluded, toExcluded);
    }

    public String getRandomName(List<String> names) {
        int index = getRandomNumber(0, names.size());
        return names.get(index);
    }
}
