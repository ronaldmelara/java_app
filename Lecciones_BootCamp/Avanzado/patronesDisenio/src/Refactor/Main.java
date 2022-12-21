package Refactor;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        int[] numeros = new int[] {12, 23, 45, 1, 9};
        imprimerMayorYMenor(numeros);
    }

    public static void imprimerMayorYMenor(int[] numeros){
        int mayor = 0;
        int menor = numeros[0];


        for(int i = 0; i < numeros.length; i++){
            //Codigo sin refactorizar
            /*if(mayor < numeros[i]){
                mayor = numeros[i];
            }

            if(menor > numeros[i]){
                menor = numeros[i];
            }*/
            //Codigo sin refactorizar

            //Refactorizacion con operador ternario
            mayor = mayor < numeros[i] ? numeros[i] : mayor;
            menor = menor > numeros[i] ? numeros[i] : menor;
            //Refactorizacion con operador ternario


            //Con programacion funcional
            mayor = Arrays.stream(numeros).reduce(0, (a, b) -> a > b ? a : b);
            menor = Arrays.stream(numeros).reduce(numeros[0], (a, b) -> a < b ? a : b);


        }



        System.out.println("Mayor: " + mayor + " menor: " + menor  );
    }
}
