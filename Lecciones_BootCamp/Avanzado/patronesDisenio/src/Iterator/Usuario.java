package Iterator;

public class Usuario {
    private String nombre;
    private int edad;

    public Usuario(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    private Usuario(){}

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }
}
