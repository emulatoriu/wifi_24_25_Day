package data;

public enum DeveloperExperience {
    JUNIOR(2800),
    INTERMEDIATE(3500),
    SENIOR(4500);

    private final int salary;

    DeveloperExperience(int salary) {
        this.salary = salary;
    }

    public int getSalary() {
        return salary;
    }
}
