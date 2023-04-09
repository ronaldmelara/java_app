package Smart;

public class SmartWatch extends SmartDevice {
    public SmartWatch() {
        super();
    }

    public SmartWatch(String modelo, String marca, String color) {
        super(modelo, marca, color);
    }

    @Override
    public void connect() {
        System.out.println("Se ha conectado un nuevo SmartWatch");
    }

    @Override
    public String toString() {
        return "SmartWatch{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
