package data;

import java.time.LocalDate;

public record Employee(String firstname, String lastname, LocalDate birthDate) {
}
