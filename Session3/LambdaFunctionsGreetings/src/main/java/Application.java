import logic.Greeter;

import java.util.List;

public class Application {
    public static void main(String[] args) {
        Greeter germanGreeter = () -> {
            System.out.println("Hallo");
        };
        Greeter spanishGreeter = () -> System.out.println("Hola");
        Greeter russianGreeter = () -> System.out.println("Privet");
        Greeter arabicGreeter = () -> System.out.println("Ahlan ua Sahlen");

        spanishGreeter.greet();
        germanGreeter.greet();

        List<Greeter> greeters = List.of(
                germanGreeter,
                spanishGreeter,
                russianGreeter,
                arabicGreeter
        );
        for(Greeter g : greeters) {
            g.greet();
        }

    }
}
