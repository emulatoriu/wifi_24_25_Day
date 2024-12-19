import java.time.LocalDateTime;

public class Application {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        int hour = now.getHour();
        String greet = hour < 18 ? "Guten Tag" : "Guten Abend";
        System.out.println(greet);
//        if(hour < 18) {
//            System.out.println("Guten Tag");
//        } else {
//            System.out.println("Guten Abend");
//        }
    }
}
