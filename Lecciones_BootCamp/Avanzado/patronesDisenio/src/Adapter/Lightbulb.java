package Adapter;

public class Lightbulb {
    boolean powerOn = false;
    int voltage = 0;

    public void turnOn(int voltage) {
        powerOn = true;
        this.voltage = voltage;
        System.out.println("Bombilla encendida");
    }

    public void turnOff() {
        powerOn = false;
        voltage = 0;
        System.out.println("Bombilla apagada");
    }

    public boolean isPowerOn() {
        System.out.println("La bombilla esta: " + isPowerOn());
        return powerOn;
    }
}
