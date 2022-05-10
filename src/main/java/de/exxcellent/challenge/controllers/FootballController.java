package de.exxcellent.challenge.controllers;

import de.exxcellent.challenge.models.FootballModel;
import de.exxcellent.challenge.views.FootballView;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;


/**
 * Controller coordinates interaction between model and view
 * It is the logic of the Code
 */

public class FootballController {


    private FootballModel footballModel;
    private FootballView footballView;

    public FootballController(FootballModel footballModel, FootballView footballView) {
        this.footballModel = footballModel;
        this.footballView = footballView;
    }

    public void startFootball(String path) {

        String line = "";
        BufferedReader br;

        {
            try {
                /**
                 * Reading from file
                 */
                br = new BufferedReader(new FileReader(path));
                HashMap<String, Double> allFootballTeams = new HashMap();

                String headerLine = br.readLine();//headerLine created to ignore first line in calculations
                double smallestDifference = 1000; //random high value for first comparison
                /**
                 * Going through each row of the file, comparing current Temperature Spread with the one that is currently
                 * the smallest and saving the smaller one as well as the day of the smaller temperature Spread
                 */
                while ((line = br.readLine()) != null) {

                    String[] footballValues = line.split(",");

                    //Absolute Difference between goals (5 -> 6th in the .csv file) and goals allowed
                    // (6 -> 7th in the .csv file)
                    double currentAbsoluteDifference = footballModel.calculateDifference
                            (Double.parseDouble(footballValues[5]), Double.parseDouble(footballValues[6]));

                    //adding all teams with their absolute difference into a hashMap to find multiple best teams
                    allFootballTeams.put(footballValues[0], currentAbsoluteDifference);

                    if (currentAbsoluteDifference < smallestDifference) {
                        smallestDifference = currentAbsoluteDifference;
                    }


//                    System.out.println("Team: "+ footballValues[0] + ", Goals: " + footballValues[5]
//                            + ", Goals Allowed: " + footballValues[6] + ", Abs.Diff: " + currentAbsoluteDifference );

                }

                //checking for multiple best teams
                for (Map.Entry<String, Double> entry: allFootballTeams.entrySet()) {
                    if(smallestDifference == entry.getValue()){
                        footballView.printFootballTeam(entry.getKey());
                    }
                }

            } catch (FileNotFoundException ex) {
                ex.printStackTrace();
            } catch (IOException e) {
                e.printStackTrace();
            }

        }


    }

}

