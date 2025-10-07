package bihavioralPatterns.strategy.observer;

public class App {

    public static void main(String[] args) {
        WeatherStation station = new WeatherStation();
        WeatherObserver weatherObserver = new WeatherObserver(station);

        station.setHumidity(100);
        station.setPressure(2);
        station.setTemperature(34);

        System.out.println("-------------------");

        station.setPressure(4);
    }
}
