package Iterator;

public class Main {
    public static void main(String[] args) {
        Usuarios usuarios = new Usuarios();
        usuarios.crear(new Usuario("Ronald", 38));
        usuarios.crear(new Usuario("Nancy", 39));
        usuarios.crear(new Usuario("Lulu", 14));
        usuarios.crear(new Usuario("Facundo Leon", 9));

        while(usuarios.hasMore()){
            Usuario usuario = usuarios.next();
            System.out.println("Usuario es: " + usuario.getNombre());
        }

        usuarios.crear(new Usuario("Docky", 12));
        Usuario usuario = usuarios.next();
        System.out.println("Usuario es: " + usuario.getNombre());


        usuarios.reset();

        while(usuarios.hasMore()){
             usuario = usuarios.next();
            System.out.println("Usuario es: " + usuario.getNombre());
        }
    }
}
