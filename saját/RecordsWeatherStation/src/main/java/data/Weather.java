package data;

import java.time.LocalDateTime;

public record Weather(LocalDateTime dateTime, double temperature, double humidity, double windSpeed) {
}
