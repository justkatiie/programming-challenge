package de.exxcellent.challenge.models;

/*
* In weather.csv you’ll find the daily weather data of a single month.
* Read the file, then output the day number (column one Day) of the day with the smallest temperature
* spread (difference between maximum & minimum temperature of the day.)
* The maximum temperature is the second column MxT, the minimum temperature the third column MnT.*/
/**
 * Model contains the data and the methods that use this data
 */
public class WeatherModel implements IDifferenceCalculator {

    public double calculateDifference(double maxTemp, double minTemp) {

        return maxTemp-minTemp;
    }

}

