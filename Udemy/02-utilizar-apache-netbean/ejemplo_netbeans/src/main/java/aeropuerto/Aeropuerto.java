/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeropuerto;

import java.util.Calendar;

/**
 *
 * @author melaragalaz
 */
public abstract class Aeropuerto implements Comparable<Aeropuerto>{

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Aeropuerto other = (Aeropuerto) obj;
        return this.id == other.id;
    }

    @Override
    public String toString() {
        return "Aeropuerto id #" + this.id  +"{" + "nombre=" + nombre + ", direccion=" + this.direccion + ", anioInauguracion=" + anioInauguracion + ", capacidad=" + 
                capacidad + " personas. \n Cuentas con los siguientes aviones:\n " + 
                mostrarAviones() + "  \n}";
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    public Direccion getDireccion() {
        return direccion;
    }

   
    public String getNombre() {
        return nombre;
    }

    

    public int getAnioInauguracion() {
        return anioInauguracion;
    }

    public int getCapacidad() {
        return capacidad;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    

    public void setAnioInauguracion(int anioInauguracion) {
        this.anioInauguracion = anioInauguracion;
    }

    public void setCapacidad(int capacidad) {
        this.capacidad = capacidad;
    }

    public Aeropuerto(String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        this.nombre = nombre;
        this.direccion = new Direccion(pais, calle, numero, ciudad);
        this.anioInauguracion = anioInauguracion;
        this.capacidad = capacidad;
        this.aviones = new Avion[MAX_AVIONES];
        this.numeroAviones = 0;
        this.id = id_autonumerico++;
    }

    public Aeropuerto() {
        this.aviones = new Avion[MAX_AVIONES];
    }
    private static int id_autonumerico = 1;
    
    private final int MAX_AVIONES = 20;
    private String nombre;
    private Direccion direccion;
    private int anioInauguracion;
    private int capacidad;
    private Avion[] aviones;
    private int numeroAviones;
    private int id;

    public int getNumeroAviones() {
        return numeroAviones;
    }
    
    public int aniosAbierto(){
        int anioActual = Calendar.getInstance().get(Calendar.YEAR);
        
        return anioActual - this.anioInauguracion;
    }
    
    public void AniadirAvion(Avion a){
        if(numeroAviones < MAX_AVIONES){
            this.aviones[numeroAviones] = a;
            numeroAviones++;
        }else{
            System.out.println("No puedes meter mas aviones");
        }
    }
    
    private String mostrarAviones(){
        String avionesCadena = "";
        for (int i = 0; i < numeroAviones; i++) {
            avionesCadena += this.aviones[i].toString() + "\n";
        }
        return avionesCadena;
    }

    @Override
    public int compareTo(Aeropuerto o) {
        if (this.anioInauguracion < o.getAnioInauguracion()) {
            return -1;
        }else if (this.anioInauguracion > o.getAnioInauguracion()) {
            return 1;
        }else{
            return 0;
        }
 
    }
    
    public abstract void gananciaTotal(double cantidad);
}
