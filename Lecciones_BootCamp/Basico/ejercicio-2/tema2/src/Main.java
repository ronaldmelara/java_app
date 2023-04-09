import java.util.Locale;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        System.out.println("Ingrese un precio neto:");
        scanner.useLocale(Locale.US);
        double precio = scanner.nextDouble();
        CalcularIva(precio);
    }

    private static void CalcularIva(double precioNeto){
        final double IVA = 0.19;
        double precioConIva = precioNeto * (1+IVA);
        System.out.println("El precio a pagar con IVA es: " + precioConIva);
    }
}