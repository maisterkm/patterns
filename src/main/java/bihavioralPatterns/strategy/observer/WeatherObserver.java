package bihavioralPatterns.strategy.observer;

public class WeatherObserver implements Observer{

    private int pressure;
    private int temperature;
    private int humidity;
    private Subject subject;

    public WeatherObserver(Subject subject) {
        this.subject = subject;
        this.subject.addObserver(this);
    }

    @Override
    public void update(int pressure, int temperature, int humidity) {
        this.pressure = pressure;
        this.temperature = temperature;
        this.humidity = humidity;
        showDate();
    }

    private void showDate() {
        System.out.println("Pressure: " + this.pressure + " temp: " + this.temperature + " humidity: " + this.humidity);
    }
}
