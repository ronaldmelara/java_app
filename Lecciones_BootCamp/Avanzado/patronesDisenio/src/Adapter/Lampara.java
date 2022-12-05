package Adapter;

public class Lampara implements Enchufable {

    boolean encendido = false;
    @Override
    public void enciende() {
        System.out.println("Lampara encendida");
        encendido = true;
    }

    @Override
    public void apaga() {
        encendido = false;
        System.out.println("Lampara apagada");
    }

    @Override
    public boolean estaEncendido() {
        return encendido;
    }
}
