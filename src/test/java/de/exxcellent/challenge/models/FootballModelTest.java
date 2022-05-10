package de.exxcellent.challenge.models;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FootballModelTest {
    @Test
    public void calculateDifference() {
        double goals = 55;
        double goalsAllowed = 45;

        assertEquals(50, (goals+goalsAllowed)/2);

    }
}
