package bihavioralPatterns.command;

//receiver - knows exactly how to perform the real work
public class Light {

    public void turnOn() {
        System.out.println("Lights are on");
    }

    public void turnOff() {
        System.out.println("Lights are off");
    }
}
