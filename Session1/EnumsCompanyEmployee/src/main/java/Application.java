import data.Developer;
import data.DeveloperExperience;

public class Application {
    public static void main(String[] args) {
        Developer developer = new Developer(0, "dfd", DeveloperExperience.SENIOR, 45000);
        Developer developer2 = new Developer(0, "dfd", DeveloperExperience.SENIOR, 4500);
        DeveloperExperience experience = developer.getExperience();
        if(experience == DeveloperExperience.SENIOR) {
            System.out.println("Gehalt: " + experience.getSalary());
        }
    }
}
