package de.exxcellent.challenge.views;
//View holds the interfaces
public class WeatherView {

    private String weatherDay;
    private String footballTeam;
    public WeatherView(String weatherDay, String footballTeam){
        this.weatherDay = weatherDay;
        this.footballTeam = footballTeam;
    }
    public WeatherView(){}

    public void print(){
        String dayWithSmallestTempSpread = weatherDay;     // Your day analysis function call …
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

        String teamWithSmallestGoalSpread = "A good team"; // Your goal analysis function call …
        System.out.printf("Team with smallest goal spread       : %s%n", teamWithSmallestGoalSpread);
    }

}
