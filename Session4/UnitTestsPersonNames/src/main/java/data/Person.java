package data;

import java.time.LocalDate;

public record Person(String firstName, String lastName, LocalDate birthdate) {
}
