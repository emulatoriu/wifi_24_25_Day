import com.fasterxml.jackson.databind.ObjectMapper;
import data.Person;
import io.MenuPrinter;
import logic.FileReader;
import logic.FileWriter;
import logic.JsonToPersonMapper;
import logic.PersonToJsonMapper;

import java.util.List;
import java.util.Scanner;

public class Application {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        MenuPrinter menuPrinter = new MenuPrinter();
        FileWriter fileWriter = new FileWriter();
        ObjectMapper objectMapper = new ObjectMapper();
        var personToJsonMapper = new PersonToJsonMapper(objectMapper);
        FileReader fileReader = new FileReader();
        var jsonToPersonMapper = new JsonToPersonMapper(objectMapper);
        String file = "persons.txt";
        while(true) {
            menuPrinter.printMenu();
            String choice = scanner.nextLine();
            switch (choice) {
                case "1":
                    System.out.print("Please enter your name: ");
                    String name = scanner.nextLine();
                    System.out.print("Please enter your email: ");
                    String email = scanner.nextLine();
                    Person person = new Person(name, email);
                    try {
                        String personAsJson = personToJsonMapper.personToJson(person);
                        fileWriter.write(file, personAsJson);
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "2":
                    try {
                        List<String> persons = fileReader.getFileContent(file);
                        for(String json : persons) {
                            Person converted = jsonToPersonMapper.jsonToPerson(json);
                            System.out.println(converted);
                        }
                    } catch (Exception e) {
                        throw new RuntimeException(e);
                    }
                    break;
                case "3":
                    return;
                default:
                    System.out.println("Please choose 1-3");
                    break;
            }
        }

    }
}
