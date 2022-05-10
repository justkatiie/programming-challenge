package de.exxcellent.challenge.models;

/**
 * Model contains the data and the methods that use this data
 */
public class WeatherModel {


    private double temperatureSpread = 0;

    public double calculateTempSpread(double maxTemp, double minTemp) {

        return temperatureSpread = maxTemp-minTemp;
    }

}

