package de.exxcellent.challenge.views;

/**View holds the interfaces
 *
 */
public class WeatherView {

    private String weatherDay = "";
    private String footballTeam = "";

    public WeatherView(){}

    public void printWeather(String weatherDay){
        String dayWithSmallestTempSpread = weatherDay;
        System.out.printf("Day with smallest temperature spread : %s%n", dayWithSmallestTempSpread);

    }

}
