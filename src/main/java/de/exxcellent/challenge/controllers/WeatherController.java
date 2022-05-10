package de.exxcellent.challenge.controllers;


import de.exxcellent.challenge.models.WeatherModel;
import de.exxcellent.challenge.views.WeatherView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**Controller coordinates interaction between model and view
 * It is the logic of the Code
 */
public class WeatherController {

    private WeatherModel weatherModel;
    private WeatherView weatherView;
    private String dayOfSmallestTempSpread;

    public WeatherController (WeatherModel weatherModel, WeatherView weatherView){
        this.weatherModel = weatherModel;
        this.weatherView = weatherView;
    }

    public WeatherController(){}

    public void start(String path){

        String line = "";
        BufferedReader br;

        {
            try {
                /**
                 * Reading from file
                 */
                br = new BufferedReader(new FileReader(path));

                String headerLine = br.readLine();//headerLine created to ignore first line in calculations
                double smallestTempSpread = 1000; //random high value for comparison

                /**
                 * Going through each row of the file, comparing current Temperature Spread with the one that is currently
                 * the smallest and saving the smaller one as well as the day of the smaller temperature Spread
                 */
                while ((line = br.readLine()) != null) {
                    String[] weatherValues = line.split(",");

                    double currentTempSpread = weatherModel.calculateTempSpread(Double.parseDouble(weatherValues[1]),
                            Double.parseDouble(weatherValues[2]));
//                    System.out.println(weatherValues[0]+ ", " + weatherValues[1]+ ", " + weatherValues[2]+ ", "
//                            + currentTempSpread); //Testing output
                    if(currentTempSpread<smallestTempSpread){
                        smallestTempSpread = currentTempSpread;
                        dayOfSmallestTempSpread = weatherValues[0];
                    }
                }

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }
    }

    public String getDay(){
        return dayOfSmallestTempSpread;
    }
}
