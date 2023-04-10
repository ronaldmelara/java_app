import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        boolean fin = false;
        String[] textos = new String[0];

        String salir = "";
        Scanner sc = new Scanner(System.in);
        sc.useDelimiter("\n");
        String textoAgregar = "";

        //Aca agregue un Scanner para solicitar al usuario que ingrese los textos, palabras o nombres que desee
        //y cuantos elementos quiera. Cada elemento se va agregando a un array y luego hago un ciclo for
        //para ir imprimiendo de a uno cada elemento
        System.out.println("ESTE EJERCICIO AGREGARÁ TEXTOS DE FORMA DINAMICA A UN ARRAY Y LUEGO LOS IMPRIMIRÁ");

        while (!fin) {


            while(!salir.equals("n")){
                System.out.println("Ingrese un texto a agregar:");
                textoAgregar = sc.next().trim();

                textos = addElement(textos, textoAgregar);

                System.out.println("Desea agregar otro texto? s/n");
                salir = sc.next();
            };


            fin = true;

        }

        System.out.println("Los textos introducidos fueron:");
        for(String item : textos){
            System.out.println(item);
        }


    }

    private static String[] addElement(String[] a, String s) {
        a = Arrays.copyOf(a, a.length +1);
        a[a.length-1] = s;
        return a;}
}