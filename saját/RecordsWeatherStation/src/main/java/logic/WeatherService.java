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

    public double getMaximumWindspeed(Weather[] weatherRecords) {
        double maximumWindspeed = 0;
        for(Weather weather : weatherRecords) {
            if (weather.windSpeed() > maximumWindspeed) {
                maximumWindspeed = weather.windSpeed();
            }
        }
        return maximumWindspeed;
    }

    public double getAverageHumidity(Weather[] weatherRecords) {
        double totalHumidity = 0;
        for(Weather weather : weatherRecords) {
            totalHumidity += weather.humidity();
        }
        int recordCount = weatherRecords.length;
        return totalHumidity / recordCount;
    }
}
