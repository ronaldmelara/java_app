package Adapter;

public class main {
    public static void main(String[] args) {
        Horno horno = new Horno();
        Lampara lampara = new Lampara();
        PowerAdapter lightbulb = new PowerAdapter();

        enciende(horno);
        enciende(lampara);
        enciende(lightbulb);


    }

    public static void enciende( Enchufable enchufable){
        enchufable.enciende();
    }

    public static void apga( Enchufable enchufable){
        enchufable.apaga();
    }

    public static void estaEncendido( Enchufable enchufable){
        enchufable.estaEncendido();
    }
}
