/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeropuerto;

/**
 *
 * @author melaragalaz
 */
public class AeropuertoPrivado extends Aeropuerto {
    private int numSocios;

    public AeropuertoPrivado(int numSocios, String nombre, String pais, String calle, int numero, String ciudad, int anioInauguracion, int capacidad) {
        super(nombre, pais, calle, numero, ciudad, anioInauguracion, capacidad);
        this.numSocios = numSocios;
    }

    public AeropuertoPrivado() {
        super();
    }

    public int getNumSocios() {
        return numSocios;
    }

    public void setNumSocios(int numSocios) {
        this.numSocios = numSocios;
    }

    @Override
    public String toString() {
        return "AeropuertoPrivado{" + "numSocios=" + numSocios + '}';
    }
    
    
    
}
