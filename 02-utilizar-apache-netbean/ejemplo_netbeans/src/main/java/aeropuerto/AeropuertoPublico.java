/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeropuerto;

/**
 *
 * @author melaragalaz
 */
public class AeropuertoPublico extends Aeropuerto {
    
    private double Financiacion;
    private int NumTrabajadoresDiscapacitados;

    public AeropuertoPublico(double Financiacion, int NumTrabajadoresDiscapacitados, String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        super(nombre, pais, calle, numero, ciudad, anioInauguracion, capacidad);
        this.Financiacion = Financiacion;
        this.NumTrabajadoresDiscapacitados = NumTrabajadoresDiscapacitados;
    }

    public AeropuertoPublico() {
        super(); //Con esto se llama el constructor vacio del padre
        
    }

    public void setFinanciacion(double Financiacion) {
        this.Financiacion = Financiacion;
    }

    public void setNumTrabajadoresDiscapacitados(int NumTrabajadoresDiscapacitados) {
        this.NumTrabajadoresDiscapacitados = NumTrabajadoresDiscapacitados;
    }

    public double getFinanciacion() {
        return Financiacion;
    }

    public int getNumTrabajadoresDiscapacitados() {
        return NumTrabajadoresDiscapacitados;
    }

    @Override
    public String toString() {
        return super.toString() + " ---> La financiación de parte del estado es {" + "Financiacion=" + Financiacion + ", NumTrabajadoresDiscapacitados=" + NumTrabajadoresDiscapacitados + '}';
    }
    
    
    
}
