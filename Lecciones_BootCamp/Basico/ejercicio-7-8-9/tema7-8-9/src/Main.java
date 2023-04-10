import MiPrograma.LeerEscribirArchivo;

import java.io.*;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.Vector;

public class Main {
    public static void main(String[] args) {

        System.out.println("----------------------------------------------------------------");
        System.out.println("EJERCICIO 0: Escribe el código que devuelva una cadena al revés. \nPor ejemplo, la cadena \"hola mundo\", debe retornar \"odnum aloh\".");
        String str = reverse("Hola mundo");
        System.out.println(str);

        System.out.println("----------------------------------------------------------------");
        System.out.println("EJERCICIO 1: Crea un array unidimensional de Strings y recórrelo, \nmostrando únicamente sus valores.");
        arrayUnidimensional();

        System.out.println("----------------------------------------------------------------");
        System.out.println("EJERCICIO 2: Crea un array bidimensional de enteros y recórrelo, \nmostrando la posición y el valor de cada elemento en ambas \ndimensiones.");
        arrayBidimensional();

        System.out.println("----------------------------------------------------------------");
        System.out.println("EJERCICIO 3: Crea un \"Vector\" del tipo de dato que prefieras, y \nañádele 5 elementos. Elimina el 2o y 3er elemento y muestra \nel resultado final.");
        Vectores();

        System.out.println("----------------------------------------------------------------");
        System.out.println("EJERCICIO 4: Indica cuál es el problema de utilizar un Vector con \nla capacidad por defecto si tuviésemos 1000 elementos para \nser añadidos al mismo.");
        System.out.println("RESPUESTA: El problema es la performance porque por cada bloque de 10 items debe realizar el volcado de datos en un nuevo array y siendo 1000 elementos afectará el tiempo de poblado de datos");

        System.out.println("----------------------------------------------------------------");
        System.out.println("EJERCICIO 5: Crea un ArrayList de tipo String, con 4 elementos. \nCópialo en una LinkedList. Recorre ambos mostrando únicamente \nel valor de cada elemento.");
        CopiarArrayListToLinkedList();

        System.out.println("----------------------------------------------------------------");
        System.out.println("EJERCICIO 6: Crea un ArrayList de tipo int, y, utilizando un bucle \nrellénalo con elementos 1..10. A continuación, con otro bucle, \nrecórrelo y elimina los numeros pares. Por último, \nvuelve a recorrerlo y muestra el ArrayList final. Si te atreves, \npuedes hacerlo en menos pasos, siempre y cuando \ncumplas el primer \"for\" de relleno..");
        PoblarArray();

        System.out.println("----------------------------------------------------------------");
        System.out.println("EJERCICIO 7: Crea una función DividePorCero. Esta, debe generar una \nexcepción (\"throws\") a su llamante del tipo ArithmeticException \nque será capturada por su llamante (desde \"main\", por ejemplo). \nSi se dispara la excepción, mostraremos el mensaje \"Esto no puede hacerse\". \nFinalmente, mostraremos en cualquier caso: \"Demo de código\".");
        try{
            Integer num = DivisionEntreCero(5);
        }catch (Exception e){
            System.out.println(e.toString());
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("EJERCICIO 8: Utilizando InputStream y PrintStream, crea una función que reciba dos parámetros: \"fileIn\" y \"fileOut\". La tarea de la \nfunción será realizar la copia del fichero dado en el parámetro \n\"fileIn\" al fichero dado en \"fileOut\"..");


        try{
            CopiarArchivo("/Users/melaragalaz/Documents/Documentos/Ronald/github-ronaldmelara/ejercicio-7-8-9/tema7-8-9/out/production/tema7-8-9/origen.txt",
                    "/Users/melaragalaz/Documents/Documentos/Ronald/github-ronaldmelara/ejercicio-7-8-9/tema7-8-9/destino.txt");
        }catch(Exception e){
            System.out.println(e);
        }

        System.out.println("----------------------------------------------------------------");
        System.out.println("EJERCICIO 9: Sorpréndenos creando un programa de tu elección que utilice InputStream, PrintStream, excepciones, un HashMap y un \nArrayList, LinkedList o array.");
        LeerEscribirArchivo miClase = new LeerEscribirArchivo();
        miClase.AgregarNombre("Ronald");
        miClase.AgregarNombre("Enrique");
        miClase.AgregarNombre("Docky");
        miClase.AgregarNombre("Lulu");
        miClase.AgregarNombre("Facundo");
        miClase.ObtenerListaFrutas();
        miClase.Run();
    }

    public static String reverse(String texto) {
        int len = texto.length();
        String newStr = new String();
        for (int i = len-1; i >= 0; i--) {
            char ch = texto.charAt(i);
            newStr += ch;
        }
        return newStr;
    }

    public static void arrayUnidimensional(){
        String[] arr = new String[]{"Elem1", "Elem2", "Elem3", "Elem4", "Elem5"};
        for(var item : arr){
            System.out.println(item);
        }
    }

    public static void arrayBidimensional(){
        int[][] arr = new int[3][2];
        arr[0][0] = 1;
        arr[0][1] = 2;
        arr[1][0] = 30;
        arr[1][1] = 40;
        arr[2][0] = 500;
        arr[2][1] = 600;
        for(int i=0; i< arr.length; i++){
            for(int j=0; j< arr[i].length; j++){
                System.out.print("VALOR{" +arr[i][j] + "} - Fila {" + i + "} COLUMNA{" + j + "}\n");
            }
        }
    }

    public static void Vectores(){
        Vector<String> nombres = new Vector<String>();
        nombres.add("Jose");
        nombres.add("Maria");
        nombres.add("Marino");
        nombres.add("Luis");
        nombres.add("Ronald");

        System.out.println(nombres);

        String elemIndex2 = nombres.get(2);
        String elemIndex3 = nombres.get(3);

        nombres.remove(elemIndex2);

        nombres.remove(elemIndex3);
        System.out.println(nombres);
    }

    private static void CopiarArrayListToLinkedList(){
        ArrayList<String> list = new ArrayList<String>();
        list.add("Jose");
        list.add("Maria");
        list.add("Marino");
        list.add("Luis");

        LinkedList<String> list2 = new LinkedList<String>();
        for(String s : list){
            list2.add(s);
        }

        for(int i = 0; i < list.size(); i++){
            System.out.println(" Val List: " + list.get(i) + " --- val LinkedList: " + list2.get(i) );
        }

    }

    private static void PoblarArray(){
        ArrayList<Integer> list = new ArrayList<Integer>();
        for(int i=0; i< 10; i++){
            list.add(i+1);
        }

        ArrayList<Integer> list2 = new ArrayList<Integer>();

        for(int z : list){
            if(z % 2 == 0){
                list2.add(z);
            }
        }


        System.out.println(list2);
    }

    private static int DivisionEntreCero(int numero) throws ArithmeticException{
        try{
            return  numero / 0;
        }catch (ArithmeticException e){
            throw new ArithmeticException("Esto no puede hacerse");
        }
        finally {
            System.out.println("Demo de codigo");
        }
    }

    private static void CopiarArchivo(String path1, String path2) throws IOException {
        try{
            File origen = new File(path1);
            File destino = new File(path2);

            InputStream in = new FileInputStream(origen);
            OutputStream out = new FileOutputStream(destino);

            byte[] buf = new byte[1024];
            int len;
            while ((len = in.read(buf)) > 0){
                out.write(buf, 0, len);
            }

            in.close();
            out.close();

        }catch (IOException ex){
            System.out.println(ex.getMessage());
            throw new IOException("Error manipulando los archivos");
        }
    }

}