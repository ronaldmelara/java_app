package Strategy;

import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        UsuarioFichero usuarios = new UsuarioFichero();

        crear(usuarios, "pepe");
        crear(usuarios, "luis");

        for(String usuario : listar(usuarios)){
            System.out.println(usuario);
        }
    }

    public static void crear(Usuarios usuarios, String nombre) {
        usuarios.crear(nombre);
    }

    public static ArrayList<String> listar(Usuarios usuarios){
        return usuarios.listar();
    }
}
