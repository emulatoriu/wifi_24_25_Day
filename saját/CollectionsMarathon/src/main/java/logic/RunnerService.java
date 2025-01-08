package logic;

import data.Runner;

import java.util.List;

public class RunnerService {
    public static double averageDuration(List<Runner> runners) {
        double totalTime = 0;
        for(Runner runner : runners) {
            totalTime += runner.durationInMinutes();
            System.out.println("");

        }
        int runnerCount = runners.size();
        return totalTime / runnerCount;
    }
}
