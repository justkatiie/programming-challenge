package de.exxcellent.challenge.views;

public class FootballView {

    private String footballTeam = "";

    public FootballView(){}

    public void printFootballTeam(String footballTeam){
        String bestTeamName = footballTeam;
        System.out.printf("Team with smallest goal spread       : %s%n", bestTeamName);
    }

}
