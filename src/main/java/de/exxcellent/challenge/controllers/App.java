package de.exxcellent.challenge.controllers;

import de.exxcellent.challenge.controllers.WeatherController;
import de.exxcellent.challenge.models.WeatherModel;
import de.exxcellent.challenge.views.WeatherView;

import java.io.*;
import java.util.Scanner;


/**
 * The entry class for your solution. This class is only aimed as starting point and not intended as baseline for your software
 * design. Read: create your own classes and packages as appropriate.
 *
 * @author Benjamin Schmid <benjamin.schmid@exxcellent.de>
 */
public final class App {

    /**
     * This is the main entry method of your program.
     * @param args The CLI arguments passed
     */
    public static void main(String... args) {

        // Your preparation code …

        String weatherPath = "src/main/resources/de/exxcellent/challenge/weather.csv";
        String footballPath = "src/main/resources/de/exxcellent/challenge/football.csv";

        WeatherModel weatherModel = new WeatherModel();
        WeatherView weatherView = new WeatherView();
        WeatherController weatherController = new WeatherController(weatherModel,weatherView);
        weatherController.start(weatherPath);

    }
}
