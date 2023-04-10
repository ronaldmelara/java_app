package State;

public class Main {
    public static void main(String[] args) {

        TelefonoMovil tel1 = new TelefonoMovil();
        System.out.println(tel1.estado.desbloquear());
        System.out.println(tel1.estado.abrirCamara());
        System.out.println(tel1.estado.hacerFoto());
        System.out.println(tel1.estado.hacerFoto());
    }
}
