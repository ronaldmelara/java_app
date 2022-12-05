package Adapter;

public class Horno implements Enchufable {

    boolean encendido = false;
    @Override
    public void enciende() {
        System.out.println("Horno encendido");
        encendido = true;
    }

    @Override
    public void apaga() {
        System.out.println("Horno apagado");
        encendido = false;
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
