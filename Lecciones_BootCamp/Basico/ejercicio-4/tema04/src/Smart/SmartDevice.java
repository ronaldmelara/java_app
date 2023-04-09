package Smart;

public abstract class SmartDevice {

    String modelo;
    String marca;
    String color;

    public SmartDevice(String modelo, String marca, String color) {
        this.modelo = modelo;
        this.marca = marca;
        this.color = color;
    }

    public SmartDevice(){
        System.out.println("Iniciando tu nuevo dispositivo");
    }

    @Override
    public String toString() {
        return "SmartDevice{" +
                "modelo='" + modelo + '\'' +
                ", marca='" + marca + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

    public abstract void connect();
}
