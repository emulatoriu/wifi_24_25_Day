package data;

public class Developer {
    private final long id;
    private String name;
    private DeveloperExperience experience;
    private int salary;

    public Developer(long id, String name, DeveloperExperience experience, int salary) {
        this.id = id;
        this.name = name;
        this.experience = experience;
        this.salary = salary;
    }

    public long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public DeveloperExperience getExperience() {
        return experience;
    }

    public void setExperience(DeveloperExperience experience) {
        this.experience = experience;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }
}
