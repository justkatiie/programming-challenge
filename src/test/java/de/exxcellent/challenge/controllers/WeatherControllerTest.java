package de.exxcellent.challenge.controllers;

import de.exxcellent.challenge.models.WeatherModel;
import de.exxcellent.challenge.views.WeatherView;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class WeatherControllerTest {

    private WeatherModel weatherModel = new WeatherModel();
    private WeatherView weatherView = new WeatherView();
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
