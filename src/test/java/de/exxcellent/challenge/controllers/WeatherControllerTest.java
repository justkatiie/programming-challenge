package de.exxcellent.challenge.controllers;

import de.exxcellent.challenge.models.WeatherModelTest;
import de.exxcellent.challenge.views.WeatherViewTest;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import static org.junit.jupiter.api.Assertions.*;

public class WeatherControllerTest {

    private WeatherModelTest weatherModel = new WeatherModelTest();
    private WeatherViewTest weatherView = new WeatherViewTest();
    private String dayOfSmallestTempSpread = "";
    private String path = "src/main/resources/de/exxcellent/challenge/weather.csv";


    @Test
    void start() throws IOException, FileNotFoundException {
        assertNotNull(path);
        String line = "";
        BufferedReader br;
        br = new BufferedReader(new FileReader(path));

        String headerLine = br.readLine();
        assertEquals("Day,MxT,MnT,AvT,AvDP,1HrP TPcpn,PDir,AvSp,Dir,MxS,SkyC,MxR,Mn,R AvSLP", headerLine );

        assertTrue((line = br.readLine()) != null);

        double smallestTempSpread = 1000;
        while ((line = br.readLine()) != null) {
            String[] weatherValues = line.split(",");

            double currentTempSpread = Double.parseDouble(weatherValues[1])-
                    Double.parseDouble(weatherValues[2]);
            if(currentTempSpread<smallestTempSpread){
                smallestTempSpread = currentTempSpread;
                dayOfSmallestTempSpread = weatherValues[0];
            }
        }

        assertEquals("14", dayOfSmallestTempSpread);}


    /*while ((line = br.readLine()) != null) {
                    String[] weatherValues = line.split(",");

                    double currentTempSpread = weatherModel.calculateDifference(Double.parseDouble(weatherValues[1]),
                            Double.parseDouble(weatherValues[2]));
                    if(currentTempSpread<smallestTempSpread){
                        smallestTempSpread = currentTempSpread;
                        dayOfSmallestTempSpread = weatherValues[0];
                    }
                }
    * */
//    @Test
//    void start(){
//
//    }

}
