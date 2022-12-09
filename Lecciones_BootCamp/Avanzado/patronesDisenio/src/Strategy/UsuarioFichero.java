package Strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Scanner;

public class UsuarioFichero implements Usuarios {
    private String ficheroUsuario = "fichero.txt";
    private PrintStream fichero;

    public UsuarioFichero(){
        try{
            fichero = new PrintStream(ficheroUsuario);

        } catch (FileNotFoundException e) {
            System.out.println("No puedo abrirlo: " + e.getMessage());
        }
    }
    @Override
    public void crear(String nombre){
        fichero.println("Nombre: " + nombre);
    }
    @Override
    public ArrayList<String> listar(){
        ArrayList<String> usuarios = new ArrayList<String>();
        try{
            Scanner scanner = new Scanner(new File(ficheroUsuario));

            while(scanner.hasNext()){
                usuarios.add(scanner.next());
            }

            scanner.close();
        }catch (Exception e){
            System.out.println("Error leyendo: " + e.getMessage());
        }

        return usuarios;
    }
}
