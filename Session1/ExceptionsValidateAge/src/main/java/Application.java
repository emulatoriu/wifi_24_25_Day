import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        System.out.println("How old are you?");
        Scanner scanner = new Scanner(System.in);
        while(true) {
            String input = scanner.nextLine();
            try {
                int age = Integer.parseInt(input);
                System.out.println(age);
                break;
            } catch (NumberFormatException nbe) {
                System.out.println("You did not type in a number");
                System.out.println(nbe.getMessage());
            } finally {
                System.out.println("Weiter");
            }
        }

    }
}
