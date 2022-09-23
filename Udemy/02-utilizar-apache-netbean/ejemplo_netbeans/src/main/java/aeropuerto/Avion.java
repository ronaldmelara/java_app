/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package aeropuerto;

/**
 *
 * @author melaragalaz
 */
public class Avion implements Activable{

    @Override
    public String toString() {
        return "Avion{" + "modelo=" + modelo + ", nAsientos=" + nAsientos + ", velocidadMaxima=" + velocidadMaxima + '}';
    }

    public Avion() {
        this.modelo = "";
        this.nAsientos = 0;
        this.velocidadMaxima = 0;
    }

    public String getModelo() {
        return modelo;
    }

    public int getnAsientos() {
        return nAsientos;
    }

    public double getVelocidadMaxima() {
        return velocidadMaxima;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public void setnAsientos(int nAsientos) {
        this.nAsientos = nAsientos;
    }

    public void setVelocidadMaxima(double velocidadMaxima) {
        this.velocidadMaxima = velocidadMaxima;
    }

    public Avion(String modelo, int nAsientos, double velocidadMaxima) {
        this.modelo = modelo;
        this.nAsientos = nAsientos;
        this.velocidadMaxima = velocidadMaxima;
    }
    private String modelo;
    private int nAsientos;
    private double velocidadMaxima;

    @Override
    public boolean isActivado() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public void setActivado(boolean value) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }
    
    
}
