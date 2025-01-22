import repository.NameRepository;

import java.util.ArrayList;
import java.util.List;

public class Application {
    public static void main(String[] args) {
        List<String> names = List.of("Mr. Dabalina", "Darth Vader", "Terminator");
        NameRepository namesRepository = new NameRepository(new ArrayList<>());
        Thread nameAdder = new Thread() {
            @Override
            public void run() {
                synchronized (namesRepository) {
                    try {
                        Thread.sleep(5000);
                    } catch (InterruptedException e) {
                        throw new RuntimeException(e);
                    }
                    for (int i=0; i< names.size(); i++) {
                        namesRepository.addName(names.get(i));
                    }
                }
            }
        };

        Thread nameRemover = new Thread() {
            @Override
            public void run() {
                try {
                    Thread.sleep(100);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }
                System.out.println("Here Thread 2, trying to take names repository");
                synchronized (namesRepository) {
                    System.out.println("Removing name");
                    namesRepository.removeFirst();
                }
            }
        };

        nameAdder.start();
        nameRemover.start();
        try {
            nameAdder.join();
            nameRemover.join();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }
        namesRepository.printNames();
    }

}
