package de.exxcellent.challenge.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class WeatherModelTest {
    @Test
    public void calculateDifference() {
        double maxTemp = 55;
        double minTemp = 45;

        assertEquals(10, (maxTemp-minTemp));

    }
}
