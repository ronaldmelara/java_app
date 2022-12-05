package Observer;

public class Main {
    public static void main(String[] args) {
        Emisora emisora = new Emisora();

        ReceptorTv tv = new ReceptorTv();
        ReceptorRadio radio = new ReceptorRadio();
        ReceptorSatelite sat = new ReceptorSatelite();

        emisora.meterReceptor(tv);
        emisora.meterReceptor(radio);
        emisora.meterReceptor(sat);

        emisora.emite();
    }
}
