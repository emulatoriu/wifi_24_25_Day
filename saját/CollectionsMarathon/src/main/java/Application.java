import data.Runner;

import java.util.ArrayList;
import java.util.List;

import static logic.RunnerService.averageDuration;

public class Application {
    public static void main(String[] args) {
        List<Runner> runners = new ArrayList<>();
        runners.add(new Runner(1, "Luke", 10));
        runners.add(new Runner(2, "Darth Vader", 8));
        runners.add(new Runner(3, "Yoda", 1));

        //System.out.println(runners.get(0));
        System.out.println(averageDuration(runners));
    }
}
