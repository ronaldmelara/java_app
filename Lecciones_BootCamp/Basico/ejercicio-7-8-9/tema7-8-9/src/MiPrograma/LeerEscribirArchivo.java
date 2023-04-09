package MiPrograma;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

public class LeerEscribirArchivo {


    private final String PATH_INICIAL = "miArchivo.txt";
    final String titulo1 = "Lista de nombres ingresados:\n";
    final String titulo2 = "Lista de Frutas:\n";
    private ArrayList<String> nombres;
    private PrintStream stream ;
    private Map<Integer, String> map;

    public LeerEscribirArchivo(){
        nombres = new ArrayList<String>();
        stream = new PrintStream(System.out);
        map = new HashMap<Integer, String>();
    }

    public void ObtenerListaFrutas(){
        map.put(1,"Frutilla");
        map.put(2,"Cereza");
        map.put(3,"Pera");
        map.put(4,"Sandia");
        map.put(15,"Melon Tuna");
        map.put(26,"Platano");
    }
    public void AgregarNombre(String nombre){
        nombres.add(nombre);
    }
    public void Run(){
        if(nombres.size()>0){
            try {
                stream.print("Se escribirán los nombres ingresados al archivo\n");
                File file = new File(PATH_INICIAL);
                // Si el archivo no existe es creado
                if (!file.exists()) {
                    file.createNewFile();
                }
                FileWriter fw = new FileWriter(file);
                BufferedWriter bw = new BufferedWriter(fw);
                bw.write(titulo1);
                for(String n : nombres ){
                    bw.write(n + "\n");
                }
                if(map.size() > 0){
                    stream.print("Se escribirá la lista de frutas en el archivo\n");
                    bw.write(titulo2);
                    Iterator it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        Map.Entry<Integer, Integer> entry = (Map.Entry)it.next();
                        bw.write("ID: " + entry.getKey() + " -----> Nombre: " + entry.getValue() + "\n");
                    }
                }else{
                    stream.print("No se generó la lista de frutas por lo que no se agregaran al archivo en proceso");
                }

                bw.close();
                stream.print("Archivo generado con el nombre de: " + PATH_INICIAL + "\n");
            } catch (Exception e) {
                e.printStackTrace();
            }
        }else{
            stream.print("No hay Nombres agregados en la lista por lo que no se puede generar el archivo.");

        }
        stream.println();
        stream.flush();
    }
}
