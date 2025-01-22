import io.NamePrinter;
import logic.NameService;
import repository.NameRepository;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Marcell", "Steffi", "Ana"));
        NameRepository nameRepository = new NameRepository(names);
        NameService nameService = new NameService(nameRepository);
        NamePrinter namePrinter = new NamePrinter(nameRepository);
        Thread t1 = new Thread() {
            @Override
            public void run() {
                synchronized (nameService) {
                    try {
                        Thread.sleep(4000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    nameService.add("Emad");
                    synchronized (namePrinter) {
                        namePrinter.print();
                    }
                }
            }
        };

        Thread t2 = new Thread() {
            @Override
            public void run() {
                synchronized (namePrinter) {
                    namePrinter.print();
                    synchronized (nameService) {
                        nameService.add("Hans");
                    }
                }
            }
        };

        t1.start();
        t2.start();

    }
}
