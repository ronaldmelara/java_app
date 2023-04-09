package Smart;

public class SmartPhone extends SmartDevice {

    public SmartPhone() {
        super();
    }

    public SmartPhone(String modelo, String marca, String color) {
        super(modelo, marca, color);
    }

    @Override
    public String toString() {
        return "SmartPhone{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public void connect() {
        System.out.println("Se ha conectado un nuevo SmartPhone");
    }


}
