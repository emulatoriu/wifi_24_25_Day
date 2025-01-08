package logic;

import data.Weather;

public class WeatherService {
    public double getAverageTemperature(Weather[] weatherRecords) {
        double totalTemperature = 0;
        for(Weather weather : weatherRecords) {
            totalTemperature += weather.temperature();
        }
        int recordCount = weatherRecords.length;
        return totalTemperature / recordCount;
    }
}
