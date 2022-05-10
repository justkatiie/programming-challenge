package de.exxcellent.challenge.models;

/*
The football.csv file contains results of the English Premier League.
The columns labeled ‘Goals’ and ‘Goals Allowed’ contain the total number of goals scored by
and against each team (so Arsenal scored 79 goals themselves and had 36 goals scored against them).
Read the file, then print the name of the team with the smallest distance (absolute difference)
between ‘Goals’ and ‘Goals Allowed’.
 * */


public class FootballModel implements IDifferenceCalculator{
    public double calculateDifference(double goals, double goalsAllowed) {
        return (goals+goalsAllowed)/2;

    }
}
