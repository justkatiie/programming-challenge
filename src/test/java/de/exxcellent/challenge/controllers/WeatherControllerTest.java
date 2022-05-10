package de.exxcellent.challenge.controllers;

import de.exxcellent.challenge.models.WeatherModelTest;
import de.exxcellent.challenge.views.WeatherViewTest;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WeatherControllerTest {

    private WeatherModelTest weatherModel = new WeatherModelTest();
    private WeatherViewTest weatherView = new WeatherViewTest();
    private String dayOfSmallestTempSpread = "";
    private String path = "src/main/resources/de/exxcellent/challenge/weather.csv";


    @Test
    void pathNotEmpty() {
        assertNotNull(path);
    }

    @Test
    void functionCall(){

    }

}
