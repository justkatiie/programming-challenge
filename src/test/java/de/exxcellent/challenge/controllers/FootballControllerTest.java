package de.exxcellent.challenge.controllers;

import de.exxcellent.challenge.models.FootballModel;
import org.junit.jupiter.api.Test;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static org.junit.jupiter.api.Assertions.*;

public class FootballControllerTest {
    private String path = "src/main/resources/de/exxcellent/challenge/football.csv";

    @Test
    public void startFootball() throws IOException {
        FootballModel footballModel = new FootballModel();
        assertNotNull(path);
        String line = "";
        BufferedReader br;
        br = new BufferedReader(new FileReader(path));

        String headerLine = br.readLine();
        assertEquals("Team,Games,Wins,Losses,Draws,Goals,Goals Allowed,Points", headerLine);

        HashMap<String, Double> allFootballTeams = new HashMap();

        //assertTrue((line = br.readLine()) != null);


        double smallestDifference = 1000;
        while ((line = br.readLine()) != null) {

            String[] footballValues = line.split(",");

            double currentAbsoluteDifference = (Double.parseDouble(footballValues[5]) +
                    Double.parseDouble(footballValues[6]))/2;


            assertEquals(50, footballModel.calculateDifference(55,45));

            //no of teams = 20
            //adding all teams with their absolute difference into a hashMap to find multiple best teams
            allFootballTeams.put(footballValues[0], currentAbsoluteDifference);


            if (currentAbsoluteDifference < smallestDifference) {
                smallestDifference = currentAbsoluteDifference;
            }

        }

        assertEquals(20, allFootballTeams.size());
        int count = 0;
        for (Map.Entry<String, Double> entry: allFootballTeams.entrySet()) {
            //System.out.println(entry.getKey());
            if(smallestDifference == entry.getValue()){
                ++count;
            }
        }
        assertEquals(2, count);


    }
}









/*
HashMap<String, Double> allFootballTeams = new HashMap();

                String headerLine = br.readLine();//headerLine created to ignore first line in calculations
                double smallestDifference = 1000; //random high value for first comparison

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


        }

        //checking for multiple best teams
        for (Map.Entry<String, Double> entry: allFootballTeams.entrySet()) {
        if(smallestDifference == entry.getValue()){
        footballView.printFootballTeam(entry.getKey());
        }
        }
 */

//                    System.out.println("Team: "+ footballValues[0] + ", Goals: " + footballValues[5]
//                            + ", Goals Allowed: " + footballValues[6] + ", Abs.Diff: " + currentAbsoluteDifference );
